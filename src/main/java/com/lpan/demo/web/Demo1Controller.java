package com.lpan.demo.web;

import com.lpan.demo.domain.DemoProperties;
import com.lpan.demo.domain.User;
import com.lpan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Lpan on 2018/1/23.
 */
@Controller
public class Demo1Controller {

    @Autowired
    private DemoProperties demoProperties;
    @Autowired
    private UserService userService;

    @RequestMapping("/test1")
    public String test1(){
        String name = demoProperties.getName();
        String phone = demoProperties.getPhone();
        return name+"--"+phone;
    }

    @RequestMapping("/user")
    public String userList( HttpServletRequest request,ModelMap modelMap){
        List<User> userlist = userService.getuserlist();
        HttpSession session = request.getSession();
        System.out.println("hello span");
        modelMap.addAttribute("userList",userlist);
        return "user/userList";
    }
}
