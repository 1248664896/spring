package com.springcloud.feigns;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ribbon-provider")
public interface GetHello {

    @RequestMapping(value = "/hello?name=feign",method = RequestMethod.GET)
    public String sayHello();

}

