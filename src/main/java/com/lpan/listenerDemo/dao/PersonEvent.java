package com.lpan.listenerDemo.dao;

import com.lpan.listenerDemo.domain.Person;

/**
 * event   事件类
 * Created by Lpan on 2018/1/31.
 */
public class PersonEvent {

    private Object source;

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    /**
     *  构造，构造事件对象时接收事件源
     * @param person
     */
    public PersonEvent(Person person) {
        this.source = person;
    }
}
