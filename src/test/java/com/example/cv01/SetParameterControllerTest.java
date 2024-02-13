package com.example.cv01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetParameterControllerTest {

    SetParameterController controller;
    @BeforeEach
    void setUp() {
        Greeter greeter = new Greeter();
        controller = new SetParameterController();
        controller.setGreeter(greeter);
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}