package com.test.tutorials.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AdditionTest {
    @Autowired
    Addition addition;

    @Test
    public void sumNumbers (){
        int [] a = {1,2,3};
        int sum = addition.sumOfNumbers(a);
        assertEquals(6,sum);
    }
}
