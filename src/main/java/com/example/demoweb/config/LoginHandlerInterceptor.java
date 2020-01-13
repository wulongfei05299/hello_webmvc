package com.example.demoweb.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: demo-web
 * @Package: com.example.demoweb.config
 * @ClassName: LoginHandlerInterceptor
 * @Description: java类作用描述
 * @Author: wlf
 * @CreateDate: 2020-1-13 10:49
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-1-13 10:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截逻辑
        if(true){
            return true;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
