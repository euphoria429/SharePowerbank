package com.hcx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hcx.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:52
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @RequestMapping("/mainpage")
    public String return2(){
        return "adminmain";
    }
    @RequestMapping("/infopage")
    public String return3(){
        return "adminuserinfo";
    }
    @RequestMapping("/orderpage")
    public String return4(){
        return "adminorder";
    }

    @RequestMapping("/adminLogout")
    public String adminLogout(HttpSession session){
        session.removeAttribute("admin");
        return "logout";
    }


    @RequestMapping("/login")
    public  String login(@RequestParam(value = "userName",required = false) String account, @RequestParam(value = "nuse",required = false) String password, HttpSession session){
        System.out.println(account+password);
        if(adminService.login(account,password)){
            session.setAttribute("admin",account);
            return "adminmain";
        }else {
            return "loginfaile";
        }

    }
}
