package com.DA.SMGuides.service;

import com.DA.SMGuides.dao.PeopleDao;
import com.DA.SMGuides.model.People;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <添加人>
 *
 * @Author： Huanghai
 * @Version: 2016-09-08
 **/
@Service
public class PeopleService {
   @Autowired
    private PeopleDao peopleDao;

    public int addPeople(People people) {
        return this.peopleDao.insert(people);
    }
}
