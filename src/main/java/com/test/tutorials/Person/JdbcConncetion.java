package com.test.tutorials.Person;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConncetion {

    public void getConnection() {
        System.out.println("Connection returned");
    }
}
