package org.kyou.stack.stackspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String doIndex() {
        return "hi, everyone!";
    }
}
