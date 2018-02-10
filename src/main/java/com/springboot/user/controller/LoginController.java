package com.springboot.user.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.user.domain.User;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(String username, String password,String vcode,Boolean rememberMe){
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        SecurityUtils.getSubject().login(token);

        return "loginSuccess";
    }

    @RequestMapping(value="/index",method=RequestMethod.GET)
    public String home(){
        Subject subject = SecurityUtils.getSubject();
        User principal = (User)subject.getPrincipal();

        return "Home";
    }

}