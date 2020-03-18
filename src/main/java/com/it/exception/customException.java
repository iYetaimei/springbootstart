package com.it.exception;


/*
    自定义全局异常类

 */

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Component
@ControllerAdvice       //
@ResponseBody
public class customException {


//    处理所有的异常
    @ExceptionHandler(Exception.class)
    public List<String> programException(){


        List<String> list  =     new ArrayList<>();
        list.add("程序异常---请检查代码");
        return list;
    }

}
