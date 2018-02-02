package com.lpan.common.bootorder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * two
 * Created by Lpan on 2018/2/2.
 */
@Component
@Order(value=1)
public class MyTwoTemplete implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("++++++++++++++加载配置文件+++++++++++++++");
    }
}
