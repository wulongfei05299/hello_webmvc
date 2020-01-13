package com.example.demoweb.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @ProjectName: demo-web
 * @Package: com.example.demoweb.config
 * @ClassName: MyLocaleResolver
 * @Description: java类作用描述
 * @Author: wlf
 * @CreateDate: 2020-1-13 10:19
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-1-13 10:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {

        String s = httpServletRequest.getParameter("l");
        Locale locale = Locale.getDefault();
        if(!StringUtils.isEmpty(s)){
           String[] sList = s.split("_");
           locale = new Locale(sList[0],sList[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
