package com.adoyo.springboot.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello-jsp")
    public String sayHello() {
        return "sayHello";
    }

    @RequestMapping("say-hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}
