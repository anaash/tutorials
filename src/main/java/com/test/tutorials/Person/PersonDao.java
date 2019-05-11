package com.test.tutorials.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
public class PersonDao {

    @Autowired
    public JdbcConncetion jdbcConncetion;

    public void getPerson() {
        jdbcConncetion.getConnection();
        System.out.println("Person Returned");
    }

}
