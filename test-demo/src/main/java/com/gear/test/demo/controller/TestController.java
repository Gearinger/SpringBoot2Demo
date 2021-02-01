package com.gear.test.demo.controller;

import com.gear.config.ResultBody;
import com.gear.config.exception.BizException;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author guoyd
 * @version 1.0.0
 * @date 2021/01/25
 */
@Api(tags = "test")
@RestController
@RequestMapping("/test")
public class TestController {
    /**
     * 测试
     *
     * @return {@link String }
     */
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test() {
        return "~~~~~~~~~~~~~~";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public ResultBody testException() throws Exception {
        return ResultBody.success("Test Wrong!!!");
    }

    @GetMapping("/test3")
    public boolean testException3() {
        System.out.println("开始新增...");
        //如果姓名为空就手动抛出一个自定义的异常！
        throw new BizException("-1", "用户姓名不能为空！");
    }

    @GetMapping("/test4")
    public boolean testException4() {
        System.out.println("开始更新...");
        //这里故意造成一个空指针的异常，并且不进行处理
        String str = null;
        str.equals("111");
        return true;
    }

    @GetMapping("/test5")
    public boolean testException5() {
        System.out.println("开始删除...");
        //这里故意造成一个异常，并且不进行处理
        Integer.parseInt("abc123");
        return true;
    }
}
