package com.hcx.test;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/21  14:35
 */
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc-config.xml","classpath:Mybatis-config.xml"})
@WebAppConfiguration("src/main/webapp")
public class BaseTest {

}