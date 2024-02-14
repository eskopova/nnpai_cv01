package com.example.cv01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetParameterControllerTest {

    @Autowired
    SetParameterController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}