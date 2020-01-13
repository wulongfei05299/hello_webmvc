package com.example.demoweb.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ProjectName: demo-web
 * @Package: com.example.demoweb.config
 * @ClassName: WebConfig
 * @Description: java类作用描述
 * @Author: wlf
 * @CreateDate: 2020-1-13 9:24
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-1-13 9:24
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/user").setViewName("success");
    }


    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/users").setViewName("success");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor())
                        .addPathPatterns("/login")//需要拦截的路径
                        .excludePathPatterns("/main");//需要排除的路径
            }
        };

        return webMvcConfigurer;
    }

    //国际化语言切换解析器
    @Bean
    public LocaleResolver localeResolver(){

        return new MyLocaleResolver();
    }

}
