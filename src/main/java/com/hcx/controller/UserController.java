package com.hcx.controller;

import com.hcx.bean.User;
import com.hcx.service.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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

    @RequestMapping("/userLogout")
    public String adminLogout(HttpSession session){
        session.removeAttribute("username");
        return "logout";
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

    @RequestMapping("/register")
    public  String register(@RequestParam(value = "phone",required = false) String userPhone, @RequestParam(value = "password",required = false) String password, @RequestParam(value = "alias",required = false) String alias){
        System.out.println(userPhone+password+alias);
        int re=userService.register(userPhone,password,alias);
        System.out.println(re);
        if(re==1){
            return "registerSuccess";
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

    @RequestMapping(value = "showInfo",produces = "text/html;charset=utf-8")
    public @ResponseBody String showInfo(String username) {
        User user = userService.selectByPhone(username);//得到用户
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user_id",user.getUserId());
        jsonObject.put("user_phone",user.getUserPhone());
        jsonObject.put("user_alias",user.getUserAlias());
        jsonObject.put("user_balance",user.getUserBalance());
//        String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + 1 + ",\"data\":" + js + "}";
        return jsonObject.toString();
    }

    @RequestMapping(value = "addmoney",produces = "text/html;charset=utf-8")
    public @ResponseBody String addmoney(String username,int money){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg",1);
        if(money<=0){
            jsonObject.put("result","0");
            return jsonObject.toString();
        }
        float money2=(float)money;
        if(userService.addMoney(username,money2)==1) {
            jsonObject.put("result","1");
        }else{
            jsonObject.put("result","0");
        }
        return jsonObject.toString();
    }

}
