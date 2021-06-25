package com.hcx.controller;

import com.hcx.bean.User;
import com.hcx.service.UserService;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/22  16:57
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/mainpage")
    public String return2(){
        return "usermain";
    }
    @RequestMapping("/infopage")
    public String return3(){
        return "userinfo";
    }
    @RequestMapping("/orderpage")
    public String return4(){
        return "userorder";
    }



    @RequestMapping("/login")
    public  String login(@RequestParam(value = "userName",required = false) String userName, @RequestParam(value = "nuse",required = false) String password, HttpSession session){
        System.out.println(userName+password);
        if(userService.login(userName,password)){
            session.setAttribute("username",userName);
            return "usermain";
        }else {
            return "loginfaile";
        }

    }

    @RequestMapping(value="findAll",produces="text/html;charset=utf-8")
    public @ResponseBody String findAll(){
        List<User> list=userService.selectAll();
        JSONArray json=JSONArray.fromObject(list);
        String js=json.toString();
        String jso="{\"code\":0,\"msg\":\"\",\"count\":"+3+",\"data\":"+js+"}";
        return jso;
    }
}
