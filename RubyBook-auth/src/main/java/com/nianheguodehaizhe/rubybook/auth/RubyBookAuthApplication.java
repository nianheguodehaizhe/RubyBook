package com.nianheguodehaizhe.rubybook.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nianheguodehaizhe.rubybook.auth.domain.mapper")
public class RubyBookAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubyBookAuthApplication.class, args);
    }

}
