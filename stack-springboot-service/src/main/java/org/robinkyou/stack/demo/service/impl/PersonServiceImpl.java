package org.robinkyou.stack.demo.service.impl;

import com.alibaba.fastjson.JSON;
import org.robinkyou.stack.demo.dao.PersonDao;
import org.robinkyou.stack.demo.domain.common.BizRequest;
import org.robinkyou.stack.demo.domain.common.BizResponse;
import org.robinkyou.stack.demo.domain.po.Person;
import org.robinkyou.stack.demo.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonServiceImpl implements PersonService {
    private static final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);
    @Resource
    private PersonDao personDao;


    @Override
    public BizResponse<Person> queryPersonByPersonId(BizRequest<Long> bizRequest) {
        logger.info("queryPersonByPersonId.param-{}", JSON.toJSONString(bizRequest));
        Person person = personDao.queryPersonByPersonId(bizRequest.getData());
        BizResponse<Person> bizResponse = BizResponse.buildSuccessResult(person);
        logger.info("queryPersonByPersonId.result-{}", JSON.toJSONString(bizResponse));
        return bizResponse;
    }
}
