package org.robinkyou.stack.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.robinkyou.stack.demo.domain.po.Person;

@Mapper
public interface PersonDao {
    Person queryPersonByPersonId(Integer personId);
}
