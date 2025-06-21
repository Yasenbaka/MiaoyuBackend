package com.miaoyu.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({
        "com.miaoyu.backend.invoice.mapper"
})
public class MiaoyuBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiaoyuBackendApplication.class, args);
    }

}
