package com.jyp.chatroom.Controller;

import com.jyp.chatroom.Entity.User;
import com.jyp.chatroom.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by jyp on 2017/3/3.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Resource
    private UserService userService;

    //通用用户功能
    @RequestMapping("/login")
    public String login(String name, String password, HttpSession session) {
        User user = userService.login(name,password);
        if ( user != null)
        {
            session.setAttribute("username", name);
            return "/index";
        }
        else
            return "/login";
    }

}
