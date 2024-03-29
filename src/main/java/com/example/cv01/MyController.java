package com.example.cv01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final Greeter greeter;

    @Autowired
    public MyController() {
        this.greeter = new Greeter();
    }

    public String sayHello() {
        return greeter.sayGreeting();
    }
}
