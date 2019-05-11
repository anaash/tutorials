package com.test.tutorials;

import com.test.tutorials.Person.PersonDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PersonApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TutorialsApplication.class, args);

        PersonDao personDao = context.getBean(PersonDao.class);
        personDao.getPerson();
        System.out.println(personDao);
        System.out.println(personDao.jdbcConncetion);

        PersonDao personDao1 = context.getBean(PersonDao.class);
        personDao1.getPerson();
        System.out.println(personDao1);
        System.out.println(personDao1.jdbcConncetion);


    }
}
