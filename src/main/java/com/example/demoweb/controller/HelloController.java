package com.example.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @ProjectName: demo-web
 * @Package: com.example.demoweb.controller
 * @ClassName: HelloController
 * @Description: java类作用描述
 * @Author: wlf
 * @CreateDate: 2020-1-12 9:58
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-1-12 9:58
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(){
        return "helloword!!!";
    }

    @RequestMapping("success")
    public String suss(Map<String,Object> map){

        map.put("hello","你好");
        return "success";
    }
}
