package com.example.waimai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ServletComponentScan
public class WaimaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaimaiApplication.class, args);
    }

}
