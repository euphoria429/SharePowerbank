package com.hcx.service.impl;

import com.hcx.bean.User;
import com.hcx.bean.UserExample;
import com.hcx.dao.UserMapper;
import com.hcx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
