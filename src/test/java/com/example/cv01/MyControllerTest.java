package com.example.cv01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyControllerTest {

    @Autowired
    MyController myController;
    @Test
    void sayHello() {
        System.out.println(myController.sayHello());
    }
}