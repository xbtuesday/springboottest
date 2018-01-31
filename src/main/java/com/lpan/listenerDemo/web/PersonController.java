package com.lpan.listenerDemo.web;

import com.lpan.listenerDemo.dao.PersonEvent;
import com.lpan.listenerDemo.dao.PersonListener;
import com.lpan.listenerDemo.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lpan on 2018/1/31.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("/eatperson")
    public void getperson(){

        //创建事件源
        Person person = new Person();
        person.setName("shipan");
        person.setWeight("120");

        //给事件源注册监听器 ()
        person.addPersionlistener(new PersonListener() {
            @Override
            public void personeating(PersonEvent event) {
                System.out.println("监听到了，");
                //在监听方法中可以获取事件源对象，进而可以操作事件源对象
                Person source = (Person) event.getSource();
                System.out.println(person.getName());
                System.out.println(person.getWeight());
            }
        });
        person.eat();


    }



}
