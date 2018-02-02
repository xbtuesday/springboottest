package com.lpan.common.bootorder;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * exit
 * Created by Lpan on 2018/2/2.
 */
@Component
public class ExitAppTemplate implements ExitCodeGenerator{
    @Override
    public int getExitCode() {
        System.out.println("===========退出了==========");
        return 0;
    }
}
