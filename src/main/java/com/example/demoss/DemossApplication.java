package com.example.demoss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demoss.mapper")
public class DemossApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemossApplication.class, args);
    }

}
