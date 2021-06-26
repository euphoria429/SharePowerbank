package com.hcx.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/22  18:12
 */
public class LoginInterceptor implements HandlerInterceptor {

    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // 执行完毕，返回前拦截
    }


    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // 在处理过程中，执行拦截
    }


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {

        String url=request.getRequestURI();
        if(url.indexOf("/login")>=0){
            return true;
        }
        HttpSession session=request.getSession();
        if(session.getAttribute("username")!=null||session.getAttribute("admin")!=null){
            return true;
        }
        response.sendRedirect(request.getContextPath()+"/login.jsp");
        return  false;
//        return true;
    }
}
