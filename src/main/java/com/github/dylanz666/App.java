package com.github.dylanz666;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : dylanz
 * @since : 09/13/2020
 */
@SpringBootApplication
@MapperScan(basePackages = "com.github.dylanz666.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
