package com.ysx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ysx
 * @Date: 2022/10/11/13:52
 * @Description:
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(String username, String password, HttpSession session, HttpServletRequest request){
        if(username.equals("admin")&&password.equals("123456")){
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            return "redirect:/employee/page/1";
        }else{
            session.setAttribute("msg", "账户:admin,密码:123456");
            return "index";
        }

    }
}
