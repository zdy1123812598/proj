package com.lea.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    /**
     * 登录
     *
     * @return
     */
    @GetMapping("/")
    public String login() {
        return "login";
    }

    /**
     * 欢迎页
     *
     * @return
     */
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 注册页
     *
     * @return
     */
    @GetMapping("/register")
    public String register() {
        return "register";
    }
}
