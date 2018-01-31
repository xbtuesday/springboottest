package com.lpan.listenerDemo.domain;

import com.lpan.listenerDemo.dao.PersonEvent;
import com.lpan.listenerDemo.dao.PersonListener;

/**
 * person   事件源
 * Created by Lpan on 2018/1/31.
 */
public class Person {

    private String name;
    private String weight;
    private PersonListener listener;

    //在事件源中 注册监听器
    public void addPersionlistener(PersonListener listener){
        this.listener = listener;
    }

    //操作事件源-- 在事件源方法中，构造事件对象参数为当前事件源，传递事件对象给监听器的监听方法

    /**
     *      1、给事件源  注册监听器
     *     2、当事件触发，比如是eat方法，eat方法会获取当前事件 new PersonEvent(this)  然后将事件传给监听器的监听方法中
     *     3、所以调事件源的方法时  会去调用监听器的方法
     *
     *
     */

    public void eat(){
        weight += 5;
        //调用监听器监听方法
        if (listener  != null){
            PersonEvent personEvent = new PersonEvent(this);
            listener.personeating(personEvent);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
