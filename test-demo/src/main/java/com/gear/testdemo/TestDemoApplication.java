package com.gear.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 测试演示应用程序
 *
 * @author guoyd
 * @version 1.0.0
 * @date 2021/01/25
 */
@SpringBootApplication(scanBasePackages = {"com.gear.*"})
@EnableSwagger2
public class TestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDemoApplication.class, args);
        System.out.println("----------程序开始运行----------");
    }
}
