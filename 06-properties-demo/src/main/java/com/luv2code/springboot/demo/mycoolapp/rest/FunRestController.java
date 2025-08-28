package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/getTeamInfo")
    public String getTeamInfo() {
        return "Coach:" + coachName + "       Team:" + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World...123";
    }

    @GetMapping("/1")
    public String sayHello2() {
        return "Hello World...123123";
    }

    @GetMapping("/abcd")
    public String sayHello3() {
        return "ABCD";
    }


}
