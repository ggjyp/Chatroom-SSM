package com.jyp.chatroom.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jyp on 2017/3/3.
 */
@Controller
public class RouteController {
    @RequestMapping(value = "")
    public String index() {
        return "login";
    }

    @RequestMapping(value = "login")
    public String login() {
        return "login";
    }
}
