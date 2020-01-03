package com.springcloud.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/")
public class IndexController {


    //@ResponseBody
    @RequestMapping("/")
    public String  index(){

        return "redirect:/www/mains";
    }


    @ResponseBody
    @RequestMapping("/aaa")
    public  String aaa(){
        return "6666";
    }

    //@ResponseBody
    @RequestMapping("/bbb")
    public  String bbb(){
        return "redirect:/www/main";
    }


}


