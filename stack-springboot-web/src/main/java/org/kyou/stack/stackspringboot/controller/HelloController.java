package org.kyou.stack.stackspringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stackSpringBoot")
public class HelloController {

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return "hello," + name;
    }
}
