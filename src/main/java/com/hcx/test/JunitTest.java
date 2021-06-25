package com.hcx.test;

import com.hcx.dao.*;
import com.hcx.service.*;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private OrdersService ordersService;
    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private LocationMapper locationMapper;


    @Resource
    private CupboardMapper cupboardMapper;
    @Resource
    private CupboardService cupboardService;

    @Test
    public void test01(){
        //mapper层测试

//        System.out.println(adminMapper.selectByPrimaryKey(1).getAdminId());
//        System.out.println(adminMapper.findByAccount("admin").getAdminId());
//            System.out.println(ordersMapper.selectByPrimaryKey(1).getOrderId());
//        System.out.println(powerbankMapper.countByExample(null));
//        System.out.println(locationMapper.countByExample(null));
        System.out.println(powerbankMapper.selectOne(1).getPobkId());
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
//        System.out.println(userService.login("16626713429","123456"));
//        System.out.println(powerbankService.countByCupId(1));
//        System.out.println(ordersService.selectByUserId(2));
//        System.out.println(ordersService.selectAll());
//        System.out.println(userService.selectByPhone("17520098429").getUserId());
//        System.out.println(ordersService.countById(1));
//        List<Orders> list=ordersService.selectByUserId(1);
//        for (Orders order:list){
//            System.out.println(order.getOrderCreatetime());
//        }
//        Log log=new Log(1l,"查询","com.hcx","123456");
//        log.setCreateDate(new Date());
//        logService.save(log);
//        System.out.println(cupboardService.findAvailable(1));
//        System.out.println(powerbankService.lentStatus(5));
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//        String date=simpleDateFormat.format(new Date());
//        System.out.println(date);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        System.out.println(cupboardService.lentupdate(1));

    }

}
