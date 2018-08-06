package com.dodostudio.dodomeloncms.modules.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping(value = {"/sys/dic"})
public class SysDicController {

    @RequestMapping(value = {"/list"})
    public String list(Map<String, Object> model){
        return "sys/dic/list";
    }

    @RequestMapping(value = {"/add"})
    public String add(Map<String, Object> model){
        return "sys/dic/add";
    }
}
