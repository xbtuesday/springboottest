package com.lpan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lpan on 2018/1/16.
 */
@RestController
public class LpanController {

//    @Value("${project.author}")
//    private String projectAuthor;
//    @Value("${project.name}")
//    private String projectName;

    @RequestMapping("/lpan")
    public String Lpan() {
//        System.out.println(projectAuthor);
//        System.out.println(projectName);
        return "Lpan";
    }
}
