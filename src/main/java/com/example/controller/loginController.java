package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/7 0007.
 */
@Controller
@RequestMapping("/login")
public class loginController {
    @RequestMapping("/init")
    public String initLogin(){
        return "/login";
    }

    @RequestMapping("/longinSearch")
    public String longinSearch(){
        return "/login";
    }
}
