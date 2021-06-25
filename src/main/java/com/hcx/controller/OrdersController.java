package com.hcx.controller;

import com.hcx.bean.Orders;
import com.hcx.service.CupboardService;
import com.hcx.service.OrdersService;
import com.hcx.service.PowerbankService;
import com.hcx.service.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/24  0:06
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private OrdersService ordersService;
    @Resource
    private UserService userService;
    @Resource
    private CupboardService cupboardService;
    @Resource
    private PowerbankService powerbankService;

    @RequestMapping(value="findAll",produces="text/html;charset=utf-8")
    public @ResponseBody String findAll(){
        List<Orders> list=ordersService.selectAll();
        int count=ordersService.countAll();
        JSONArray json=JSONArray.fromObject(list);
        String js=json.toString();
        String jso="{\"code\":0,\"msg\":\"\",\"count\":"+3+",\"data\":"+js+"}";
        return jso;
//        List<User> list=userService.selectAll();
//        JSONArray json=JSONArray.fromObject(list);
//        String js=json.toString();
//        String jso="{\"code\":0,\"msg\":\"\",\"count\":"+3+",\"data\":"+js+"}";
//        return jso;
    }
    @RequestMapping(value="findOrderByName",produces="text/html;charset=utf-8")
    public @ResponseBody String findOrderByName(String username){
        System.out.println("得到的用户名"+username);
        int id=userService.selectByPhone(username).getUserId();
        int count=ordersService.countById(id);
        List<Orders> list=ordersService.selectByUserId(id);
        JSONArray json=JSONArray.fromObject(list);
        String js=json.toString();
        String jso="{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";
        return jso;
    }

    @RequestMapping(value = "lentPobk",produces = "text/html;charset=utf-8")
    @ResponseBody
    public  String lentPobk(int cup_id, String username){
//        判断柜子有没有可用充电宝
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","1");
        if(cupboardService.findAvailable(cup_id)==0){
            jsonObject.put("result","0");
        }else {
            //        查找用户id
            int user_id=userService.selectByPhone(username).getUserId();
//        取出的充电宝id
            int lent_pobkid=powerbankService.selectOne(cup_id).getPobkId();
            System.out.println("用户id="+user_id+"充电宝id"+lent_pobkid);
            int lentstatus=powerbankService.lentStatus(lent_pobkid);

            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date=simpleDateFormat.format(new Date());
            System.out.println(date);
            Orders orders=new Orders(user_id,lent_pobkid,date,"未归还");
            int createorder=ordersService.createOrder(orders);
            int cupboardlentupdate=cupboardService.lentupdate(cup_id);//充电宝可用数-1
            if(lentstatus==1&&createorder==1&&cupboardlentupdate==1){
                jsonObject.put("result","1");
            }else {
                jsonObject.put("result","0");
            }
        }
        return jsonObject.toString();

    }

}
