package com.gear.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 测试演示应用程序
 *
 * @author guoyd
 * @version 1.0.0
 * @date 2021/01/25
 */
@SpringBootApplication(scanBasePackages = {"com.gear.config", "com.gear.test.demo"})
@EnableSwagger2
public class TestDemoApplication {

    @Autowired
    ServerProperties serverProperties;

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(TestDemoApplication.class, args);
        System.out.println("----------程序开始运行----------");
    }
}
