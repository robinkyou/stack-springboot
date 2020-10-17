package org.kyou.stack.stackspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"org.robinkyou.stack.demo.dao"})
@ComponentScan(basePackages = {"org.robinkyou.stack.demo.service","org.kyou.stack.stackspringboot"})
public class StackSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StackSpringbootApplication.class, args);
    }

}
