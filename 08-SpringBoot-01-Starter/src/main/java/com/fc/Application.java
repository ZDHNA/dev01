package com.fc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

//当前项目启动类
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("给JVM传递的参数："+ Arrays.toString(args));
        SpringApplication.run(Application.class, args);
    }

}
