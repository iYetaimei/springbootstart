package com.it.emprty;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/*
    spring  配置文件属性注入

    bean 需要交给spring管理才可以 注入属性


@Data
@Component
@PropertySource("classpath:book.properties")
public class Book {

    @Value("${book.id}")
    private Long id;
    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String auther;

}*/

/*
    类型安全注入

    在bean上加上@ConfigurationProperties(prefix = "book")

    解析配置的book前缀在spring寻找和字段名匹配的属性注入到bean 属性中


 */
@Data
@Component
@PropertySource("classpath:book.properties")
@ConfigurationProperties(prefix = "book")
public class Book {

    //@Value("${book.id}")
    private Long id;
//    @Value("${book.name}")
    private String name;
//    @Value("${book.author}")
    private String author;

}

