package com.hcx.controller;

import com.hcx.bean.Powerbank;
import com.hcx.service.CupboardService;
import com.hcx.service.OrdersService;
import com.hcx.service.PowerbankService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/23  14:25
 */

@Controller
@RequestMapping("/powerbank")
public class PowerbankController {
    @Resource
    private PowerbankService powerbankService;
    @Resource
    private CupboardService cupboardService;

    @RequestMapping("/showcount")
    public int showcount(int id){
        return powerbankService.countByCupId(id);
    }

    @RequestMapping(value = "putPobk",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String putPobk(int cup_id){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","1");

        int put=cupboardService.putUpdate(cup_id);//柜子数量和可用数都+1，成功返回1
        int putPobk=powerbankService.putUpdate(cup_id);//记录柜子id，new一个pobk，成功返回1
        if(put==1&&putPobk==1){
            jsonObject.put("result","1");
        }else{
            jsonObject.put("result","0");
        }
        return jsonObject.toString();
    }


    //点击查看归还弹出小窗
    @RequestMapping(value = "pobkpage",produces = "text/html;charset=utf-8")
    public String pobkpage(int cup_id, HttpSession session){
        System.out.println("cupid="+cup_id);
        session.setAttribute("cup_id",cup_id);
        return "pobkpage";
    }

    @RequestMapping(value = "showPobkByCupId",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String showPobkByCupId(int cup_id){
        int count=powerbankService.countByCupId(cup_id);//当前柜子里pobk数量
        List<Powerbank> list=powerbankService.selectAllByCupId(cup_id);
        JSONArray json= JSONArray.fromObject(list);
        String js=json.toString();
        String jso="{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";
        return jso;
    }

    @RequestMapping(value = "recyclePobk",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String recyclePobk(int cup_id,int pobk_id){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","1");

        int recycle=cupboardService.recycleUpdate(cup_id);//柜子数量和可用数都-1，成功返回1
        int recyclePobk=powerbankService.recycleUpdate(pobk_id);//根据pobk_id把状态改成recycle，柜子id改成0,成功返回1
        if(recycle==1&&recyclePobk==1){
            jsonObject.put("result","1");
        }else{
            jsonObject.put("result","0");
        }
        return jsonObject.toString();
    }
}
