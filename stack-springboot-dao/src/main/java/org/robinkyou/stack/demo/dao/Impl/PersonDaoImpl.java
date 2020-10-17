package org.robinkyou.stack.demo.dao.Impl;

import org.apache.ibatis.annotations.Mapper;
import org.robinkyou.stack.demo.dao.PersonDao;
import org.robinkyou.stack.demo.domain.po.Person;

@Mapper
public class PersonDaoImpl implements PersonDao {
    @Override
    public Person queryPersonByPersonId(Long personId) {
        return null;
    }
}
