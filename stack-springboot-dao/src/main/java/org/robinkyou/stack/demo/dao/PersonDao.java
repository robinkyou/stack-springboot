package org.robinkyou.stack.demo.dao;

import org.robinkyou.stack.demo.domain.po.Person;

public interface PersonDao {
    Person queryPersonByPersonId(Long personId);
}
