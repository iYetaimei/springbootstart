package com.it.comtroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//相当于 controller 和 ResponseBody
public class HelloController {

    @Value("${server.port}")
    private String prot;

    @GetMapping("/index")
    public String index(){
        return "hello springboot"+prot;
    }
}
