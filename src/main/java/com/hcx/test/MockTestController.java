package com.hcx.test;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/22  19:57
 */
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-config.xml","classpath:Mybatis-config.xml"})

@WebAppConfiguration
public class  MockTestController
{
    protected MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext wac;

    @Before()  //这个方法在每个方法执行之前都会执行一遍
    public void setup()
    {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  //初始化MockMvc对象
    }

    @Test
    public void getAllCategoryTest() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/user/findAll")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("id","1")   //添加参数(可以添加多个)
                        //.param("id","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest2() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/cupboard/findInfo")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
//                                .param("id","1")   //添加参数(可以添加多个)
                        //.param("id","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest3() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        post("/orders/findOrderByName")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("username","17520098429")   //添加参数(可以添加多个)
                        //.param("id","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest4() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/orders/lentPobk")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("cup_id","1")   //添加参数(可以添加多个)
                        .param("username","17520098429")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest5() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        post("/orders/showreturnOrder")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("username","17520098429")   //添加参数(可以添加多个)
                        //.param("id","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest6() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/user/showInfo")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("username","17520098429")   //添加参数(可以添加多个)
                        //.param("id","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest7() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/user/addmoney")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("username","17520098429")
                                .param("money","15") //添加参数(可以添加多个)
                        //.param("id","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest8() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/orders/delorder")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("order_id","4")
                                 //添加参数(可以添加多个)
                        //.param("id","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest9() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/orders/changeCost")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("order_id","48")
                        //添加参数(可以添加多个)
                        .param("cost","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest10() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/powerbank/putPobk")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("cup_id","1")
                                //添加参数(可以添加多个)
//                                .param("cost","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest11() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/powerbank/showPobkByCupId")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("cup_id","2")
                        //添加参数(可以添加多个)
//                                .param("cost","3")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    @Test
    public void getAllCategoryTest12() throws Exception
    {
        String responseString = mockMvc.perform
                (
                        get("/powerbank/recyclePobk")          //请求的url,请求的方法是get
                                //get("/user/showUser2")          //请求的url,请求的方法是get
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
                                .param("cup_id","2")
                        //添加参数(可以添加多个)
                                .param("pobk_id","9")   //添加参数(可以添加多个)
                )
                .andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }
}
