package com.springcloud.ribbons.Controller;

import com.springcloud.ribbons.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    public String name = "亿万富翁程序猿";

    @GetMapping("/hello")
    public String sayHello(String name){
        return helloService.sayHello() + " " + this.name;
    }


}
