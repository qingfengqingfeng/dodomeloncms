package com.dodostudio.dodomeloncms.modules.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(value = {"/sys/globalconfig"})
public class SysGlobalConfigController {

    @RequestMapping(value = {"/list"})
    public String list(Map<String, Object> model){

        return "sys/globalconfig/list";
    }

    @RequestMapping(value = {"/add"})
    public String add(Map<String, Object> model){
        return "sys/globalconfig/add";
    }
}
