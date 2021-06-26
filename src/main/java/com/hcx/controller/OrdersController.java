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
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
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
        int count=ordersService.countById(id);//订单数量
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

    @RequestMapping(value = "returnPobk",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String returnPobk(int order_id,int cup_id,int pobk_id,String username) throws ParseException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","1");

        int user_id=userService.selectByPhone(username).getUserId();//查找用户id

//        判断柜子满了没，不是满的才可以还
        if(cupboardService.findAvailable(cup_id)==cupboardService.findTotal(cup_id)){
            jsonObject.put("result","0");
        }else {
            //对该充电宝的操作
            int pobk=powerbankService.avaliStatus(cup_id,pobk_id);//修改充电宝当前所在柜以及状态，成功返回1
            //对该柜子的操作
            int cup=cupboardService.avaliUpdate(cup_id);//可用充电宝数+1，成功返回1
            //对该订单的操作
            int ord=ordersService.calOrder(order_id);//添加归还时间，修改状态，成功返回1
            if(pobk==1&&cup==1&&ord==1){
                jsonObject.put("result","1");
            }else{
                jsonObject.put("result","0");
            }
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "showreturnOrder",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String showreturnOrder(String username){
        int id=userService.selectByPhone(username).getUserId();//得到用户id
        int count=ordersService.countReturnOrder(id);//未归还订单数量
        List<Orders> list=ordersService.selectNotReturn(id);//得到该用户未归还订单
        JSONArray json=JSONArray.fromObject(list);
        String js=json.toString();
        String jso="{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";
        return jso;
    }

    //点击归还弹出小窗
    @RequestMapping(value = "orderpage",produces = "text/html;charset=utf-8")
    public String orderpage(int cup_id, HttpSession session){
        System.out.println("cupid="+cup_id);
        session.setAttribute("cup_id",cup_id);
        return "orderpage";
    }

    @RequestMapping(value = "payorder",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String payOrder(int order_id,String username){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","1");
        int user_id=userService.selectByPhone(username).getUserId();//得到用户id
        float b=userService.selectByPhone(username).getUserBalance();
        int balance=(int)b;//得到用户余额
        int cost=ordersService.selectByOrderId(order_id).getOrderCost();//得到订单金额
        if(balance<cost){//不够钱哦
            jsonObject.put("result","0");
        }else{
            int pay=userService.deduct(user_id,cost);//从钱包扣钱，成功返回1
            int orderStatus=ordersService.payOrder(order_id);//修改订单中状态，成功返回1
            if(pay==1&&orderStatus==1){
                jsonObject.put("result","1");
            }else{
                jsonObject.put("result","0");
            }
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "delorder",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delorder(int order_id){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","1");
        int del=ordersService.delOrderByOrderId(order_id);//删除订单，成功返回1
        if(del==1){
            jsonObject.put("result","1");
        }else{
            jsonObject.put("result","0");
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "changeCost",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String changeCost(int order_id,int cost){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","1");
        System.out.println(cost);
        if(cost<0){
            jsonObject.put("result","0");
            return jsonObject.toString();
        }
        int change=ordersService.adminChangeCost(order_id,cost);//修改订单金额，成功返回1
        if(change==1){
            jsonObject.put("result","1");
        }else{
            jsonObject.put("result","0");
        }
        return jsonObject.toString();
    }
}
