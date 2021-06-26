package com.hcx.service.impl;

import com.hcx.bean.User;
import com.hcx.bean.UserExample;
import com.hcx.dao.UserMapper;
import com.hcx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/22  16:32
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public boolean insert(User user) {
        if (user == null )return false;
        return  userMapper.insertSelective(user)>0?true:false;
    }

    public boolean delete(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId)>0?true:false;
    }

    public boolean update(User user) {
        if (user == null )return false;
        return userMapper.updateByPrimaryKeySelective(user)>0?true:false;
    }

    public User selectById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public User selectByPhone(String userPhone) {
        return userMapper.findbyuser_phone(userPhone);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
//    @MyLog(value = "登录")
    public boolean login(String phoneNumber, String password) {
        if(phoneNumber==null||password==null) return false;

        User user=userMapper.findbyuser_phone(phoneNumber);

        if(user==null) return false;
        return user.getUserPassword().equals(password);
    }

    public List<User> selectAll() {
        return userMapper.selectByExample(null);
    }

    public List<User> selectByAlias(String Alias) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andUserAliasEqualTo(Alias);
        return userMapper.selectByExample(example);
    }

    public int deduct(int user_id, int cost) {
        float balance=userMapper.selectByPrimaryKey(user_id).getUserBalance();
        int b=(int)balance;
        int c=b-cost;//扣款之后的余额;
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andUserIdEqualTo(user_id);
        User user=new User();
        user.setUserBalance((float)c);
        return userMapper.updateByExampleSelective(user,example);
    }

    public int addMoney(String username, float money2) {
        float balcane=userMapper.findbyuser_phone(username).getUserBalance();
        float after_balance=balcane+money2;//充值之后的余额
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andUserPhoneEqualTo(username);
        User user=new User();
        user.setUserBalance(after_balance);
        return userMapper.updateByExampleSelective(user,example);
    }

    public int register(String user_phone, String user_password, String user_alias) {
        User user=new User();
        user.setUserPhone(user_phone);
        user.setUserPassword(user_password);
        user.setUserAlias(user_alias);
        user.setUserBalance((float)0);
        return userMapper.insert(user);
    }

}
