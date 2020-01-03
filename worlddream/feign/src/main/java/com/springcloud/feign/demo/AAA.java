package com.springcloud.feign.demo;

import com.springcloud.homepage.Entity.Demo;

public class AAA {


    public static void main(String[] args) {
        Demo Demo = new Demo();
        String str = Demo.aaa();
        System.out.println("字符串"+"----------------->"+str);
    }
}
