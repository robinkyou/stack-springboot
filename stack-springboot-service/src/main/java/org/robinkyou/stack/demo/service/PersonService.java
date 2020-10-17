package org.robinkyou.stack.demo.service;

import org.robinkyou.stack.demo.domain.common.BizRequest;
import org.robinkyou.stack.demo.domain.common.BizResponse;
import org.robinkyou.stack.demo.domain.po.Person;

public interface PersonService {
    BizResponse<Person> queryPersonByPersonId(BizRequest<Long> personId);
}
