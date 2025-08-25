package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World...123";
    }

    @GetMapping("/1")
    public String sayHello2(){
        return "Hello World...123123";
    }

    @GetMapping("/abcd")
    public String sayHello3(){
        return "ABCD";
    }


}
