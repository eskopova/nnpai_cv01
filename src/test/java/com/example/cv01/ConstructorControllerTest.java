package com.example.cv01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorControllerTest {

    ConstructorController controller;
    @BeforeEach
    void setUp() {
        Greeter greeter = new Greeter();
        controller = new ConstructorController(greeter);
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}