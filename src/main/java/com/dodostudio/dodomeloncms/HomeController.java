package com.dodostudio.dodomeloncms;

import com.dodostudio.dodomeloncms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.util.Map;

import com.dodostudio.dodomeloncms.model.User;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/"})
    public String index(Map<String, Object> model){


        return "index";
    }

    @RequestMapping(value = {"/home"})
    public String home(Map<String, Object> model){
        // 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
        // 本例为 /WEB-INF/jsp/index.jsp
        model.put("time", new Date());
        model.put("message","Hello World!");
        User user = userService.getUserById(2);
        if(null!=user){
            model.put("uname",user.getUsername());
        }
        return "home";
    }
}
