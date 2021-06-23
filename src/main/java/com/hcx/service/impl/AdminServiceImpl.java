package com.hcx.service.impl;

import com.github.pagehelper.PageHelper;
import com.hcx.bean.Admin;
import com.hcx.bean.AdminExample;
import com.hcx.bean.UserExample;
import com.hcx.dao.AdminMapper;
import com.hcx.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:43
 */
@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public boolean insert(Admin admin) {
        return adminMapper.insertSelective(admin)>0?true:false;
    }

    public boolean delete(Integer id) {
        return adminMapper.deleteByPrimaryKey(id)>0?true:false;
    }

    public boolean update(Admin admin) {
        return adminMapper.updateByPrimaryKeySelective(admin)>0?true:false;
    }

    public Admin selectById(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    public boolean login(String account, String password) {
        if(account==null||password==null) return false;
        Admin admin=adminMapper.findByAccount(account);
        if(admin==null) return false;
        return admin.getAdminPassword().equals(password);
    }

//    public List<Admin> selectByAccount(String account) {
//        AdminExample example= new AdminExample();
//        AdminExample.Criteria criteria=example.createCriteria();
//        criteria.andAdminAccountEqualTo(account);
//        return adminMapper.selectByExample(example);
//
//    }

    public Admin selectByAccount(String account) {
        return adminMapper.findByAccount(account);
    }


}
