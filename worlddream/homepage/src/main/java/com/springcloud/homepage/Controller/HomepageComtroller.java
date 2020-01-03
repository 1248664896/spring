package com.springcloud.homepage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/www")
public class HomepageComtroller {

    //@ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "/index";
    }

    @ResponseBody
    @RequestMapping("/indexs")
    public String indexs(){
        return "/index";
    }


}
