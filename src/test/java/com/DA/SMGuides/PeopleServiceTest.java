package com.DA.SMGuides;

import com.DA.SMGuides.model.People;
import com.DA.SMGuides.service.PeopleService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <类详细说明>
 *
 * @Author：
 * @Version: 2016-09-08
 **/
public class PeopleServiceTest {
    private PeopleService peopleService;

    @Before
    public void init()  {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        peopleService = (PeopleService) context.getBean("peopleService");
    }

    @Test
    public void test()  {
        People people = new People();
        people.setName("王书记");
        System.out.println(peopleService.addPeople(people));
    }
}
