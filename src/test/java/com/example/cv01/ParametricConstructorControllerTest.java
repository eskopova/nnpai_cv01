package com.example.cv01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParametricConstructorControllerTest {

    @Autowired
    ParametricConstructorController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}