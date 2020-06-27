package com.lea.proj.controller;

import com.lea.proj.model.Users;
import com.lea.proj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户
 */
@Controller
public class LoginController extends BaseController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public String register(Users users) {
        userService.register(users);
        return "SUCCESS";
    }

    /**
     * 登录校验
     *
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if (null == userName || null == password) {
            return "redirect:/";
        }
        Users user = userService.login(userName, password);
        if (null != user) {
            //  校验通过时，在session里放入一个标识
            // 后续通过session里是否存在该标识来判断用户是否登录
            request.getSession().setAttribute("loginName", "admin");
            return "redirect:/index";
        } else {
            return "redirect:/";
        }
    }

    /**
     * 注销登录
     *
     * @param request
     * @return
     */
    @RequestMapping("/loginout")
    public String loginOut(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }

}