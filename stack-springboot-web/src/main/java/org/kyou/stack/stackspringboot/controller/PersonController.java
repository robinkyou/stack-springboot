package org.kyou.stack.stackspringboot.controller;

import org.robinkyou.stack.demo.domain.common.BizRequest;
import org.robinkyou.stack.demo.domain.common.BizResponse;
import org.robinkyou.stack.demo.domain.po.Person;
import org.robinkyou.stack.demo.service.PersonService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class PersonController {
    @Resource
    private PersonService personService;

    @RequestMapping("/queryPersonByPersonId/{personId}")
    public BizResponse<Person> queryPersonByPersonId(@PathVariable Long personId){
        BizRequest<Long> bizRequest = new BizRequest<>();
        bizRequest.setRequestId(UUID.randomUUID().toString());
        bizRequest.setClientIp("127.0.0.1");
        bizRequest.setData(personId);
        return personService.queryPersonByPersonId(bizRequest);
    }
}