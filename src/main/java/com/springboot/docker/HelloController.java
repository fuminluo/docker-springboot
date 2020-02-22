package com.springboot.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author administered
 * @Description
 * @Date 2019/7/7 21:01
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "<h1>Hello Spring-Boot Maven Docker</h1>";
    }

}
