package com.lpan;

import org.springframework.web.bind.annotation.RequestMapping;
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
