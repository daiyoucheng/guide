package com.example.controller;

import com.example.bean.UserBean;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/7 0007.
 */
@Controller
@RequestMapping("/login")
public class loginController {

    @Autowired
    UserService userService;

    @RequestMapping("/init")
    public String initLogin(){
        return "/login";
    }

    @RequestMapping("/longinSearch")
    @ResponseBody
    public String longinSearch(@RequestBody UserBean userBean){
        int size =  userService.search(userBean).size();
        return "/login";
    }
}
