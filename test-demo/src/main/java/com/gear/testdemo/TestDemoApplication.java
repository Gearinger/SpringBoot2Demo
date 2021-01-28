package com.gear.testdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.env.PropertySource;
import org.springframework.web.context.support.ServletConfigPropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 测试演示应用程序
 *
 * @author guoyd
 * @version 1.0.0
 * @date 2021/01/25
 */
@SpringBootApplication(scanBasePackages = {"com.gear.config", "com.gear.testdemo"})
@EnableSwagger2
public class TestDemoApplication {

    @Autowired
    ServerProperties serverProperties;

    public static void main(String[] args) {
        SpringApplication.run(TestDemoApplication.class, args);
        System.out.println("----------程序开始运行----------");
    }
}
