package com.lpan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan   //扫描我们自定义的servlet
//@SpringBootAplication相当于    @Configuration，@EnableAutoConfiguration，@CompmentScan
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringboottestApplication {
	public static void main(String[] args) {
	    SpringApplication springApplication = new SpringApplication(args);
        springApplication.run(SpringboottestApplication.class);
	}
}
