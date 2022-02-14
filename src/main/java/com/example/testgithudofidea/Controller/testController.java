package com.example.testgithudofidea.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyulong
 * @create 2022-02-14 9:46
 * @create 2022-二月  星期一
 * @project TestGithudOfIDEA
 */
@RestController
@RequestMapping("/api")
public class testController {
    @GetMapping("/test")
    public String totTest() {
        return "测试";
    }
}
