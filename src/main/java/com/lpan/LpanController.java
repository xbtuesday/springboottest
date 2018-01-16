package com.lpan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lpan on 2018/1/16.
 */
//@RestController
@Controller
@EnableAutoConfiguration
public class LpanController {

    @RequestMapping("/lpan")
    @ResponseBody
    public String Lpan(){
        System.out.println("123");
        return "Lpan";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(LpanController.class, args);
    }
}
