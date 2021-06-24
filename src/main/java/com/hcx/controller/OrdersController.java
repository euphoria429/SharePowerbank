package com.hcx.controller;

import com.hcx.service.OrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/24  0:06
 */
@Controller
@RequestMapping("/order")
public class OrdersController {
    @Resource
    private OrdersService ordersService;

//    @RequestMapping(value="findAll",produces="text/html;charset=utf-8")
//    public @ResponseBody String findAll(){
//        List<User> list=userService.selectAll();
//        JSONArray json=JSONArray.fromObject(list);
//        String js=json.toString();
//        String jso="{\"code\":0,\"msg\":\"\",\"count\":"+3+",\"data\":"+js+"}";
//        return jso;
//    }
    @RequestMapping(value="findOrderByName",produces="text/html;charset=utf-8")
    public @ResponseBody String findOrderByName(String username){
        return null;
    }
}
