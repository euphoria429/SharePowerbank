package com.hcx.service;

import com.hcx.bean.User;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:43
 */
public interface UserService {
    public boolean insert(User user);
    public boolean delete(Integer userId);
    public boolean update(User user);
    public User selectById(Integer userId);
    public User selectByPhone(String userPhone);
    public boolean login(String phoneNumber,String password);
    public List<User> selectAll();
    public List<User> selectByAlias(String Alias);
}
