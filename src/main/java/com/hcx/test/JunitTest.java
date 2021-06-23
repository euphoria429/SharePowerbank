package com.hcx.test;

import com.hcx.bean.Admin;
import com.hcx.bean.User;
import com.hcx.dao.AdminMapper;
import com.hcx.dao.PowerbankMapper;
import com.hcx.dao.UserMapper;
import com.hcx.service.AdminService;
import com.hcx.service.OrderService;
import com.hcx.service.PowerbankService;
import com.hcx.service.UserService;
import com.hcx.service.impl.AdminServiceImpl;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/21  14:25
 */
public class JunitTest extends BaseTest {

    @Resource
    private AdminService adminService;
    @Resource
    private AdminMapper adminMapper;
    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;

    @Resource
    private PowerbankService powerbankService;
    @Resource
    private PowerbankMapper powerbankMapper;

    @Resource
    private OrderService orderService;

    @Test
    public void test01(){
        //mapper层测试

        System.out.println(adminMapper.selectByPrimaryKey(1).getAdminId());
        System.out.println(adminMapper.findByAccount("admin").getAdminId());
    }
    @Test
    public void test02(){
        //service层测试
//        System.out.println(adminService.login("admin","123456"));//true
//        System.out.println(adminService.selectById(1).getAdminId());//1

//        List<Admin> list = adminService.selectByAccount("admin");
//        for(Admin users : list){
//            System.out.println(users.getAdminAccount());
//        }
//        System.out.println(userService.selectByPhone("17520098429").getUserAlias());
//        List<User> list=userService.selectAll();
//        for(User users:list){
//            System.out.println(users.getUserAlias());
//        }
//        System.out.println(userService.login("17520098429","123456"));
//        System.out.println(powerbankService.countByCupId(1));
        System.out.println(orderService.selectByUserId(2));
        System.out.println(orderService.selectAll());
    }

}
