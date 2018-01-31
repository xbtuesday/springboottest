package com.lpan.common.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * RequestListener
 * Created by Lpan on 2018/1/31.
 */
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("servletRequestListener 被销毁了："+sre.getServletRequest());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("servletRequestListener 被创建了："+sre.getServletRequest());
    }
}
