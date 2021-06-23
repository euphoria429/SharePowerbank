package com.hcx.service;

import com.hcx.bean.Admin;
import com.hcx.bean.AdminExample;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:40
 */
public interface AdminService {

    public boolean insert(Admin admin);
    public boolean delete(Integer id);
    public boolean update(Admin admin);
    public Admin selectById(Integer id);
    public boolean login(String account,String password);
//    public List<Admin> selectByAccount(String account);
    public Admin selectByAccount(String account);

}
