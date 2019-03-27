package com.huangbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@SpringBootApplication

public class SpringbootMybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
