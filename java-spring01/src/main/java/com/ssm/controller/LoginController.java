package com.ssm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@SuppressWarnings("all")
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        System.out.println("詹姆斯");
        return "test";
    }
}

