package com.lpan.common.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Listener
 * Created by Lpan on 2018/1/31.
 */

/**
 *
 *
 *
 *
 */
@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器被初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听器被销毁");
    }
}
