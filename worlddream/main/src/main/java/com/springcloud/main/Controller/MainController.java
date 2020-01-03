package com.springcloud.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/wwww")
public class MainController {



    @ResponseBody
    @RequestMapping("/mains")
    public String mains(){
        return "/index";
    }
}
