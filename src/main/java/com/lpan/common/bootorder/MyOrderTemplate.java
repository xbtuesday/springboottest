package com.lpan.common.bootorder;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * order template
 * Created by Lpan on 2018/2/2.
 *  在你启动SpringBoor时如果需要进行一些操作，或者执行一行代码，甚至加载数据源，配置文件之类  便可以实现APplicationRunner或者CommandLineRunner接口  实现其中的run()方法
 *      当你有好几个这样的类时  需要定义加载的顺序 可以实现org.springframework.core.annotation.Order 接口，设置value的值，或者也可以使用@Order注解
 *
 *
 *
 */
@Component
@Order(value = 2)
public class MyOrderTemplate implements ApplicationRunner{
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==========加载配置文件========");
    }
}
