package com.it.comtroller;

import com.it.emprty.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//相当于 controller 和 ResponseBody
public class HelloController {

    @Value("${server.port}")
    private String prot;

    @Autowired
    private Book book;

    @GetMapping("/index")
    public String index(){
        return "hello springboot"+prot+book
                ;
    }

    @GetMapping("/exception")
    public String exception() throws MissingServletRequestParameterException {
        throw new MissingServletRequestParameterException("1","asd");
    }
}
