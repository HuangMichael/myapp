package com.huangbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@RestController
@EnableTransactionManagement
@EnableSwagger2
public class Application {
    /**
     * 启动入口
     */
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}