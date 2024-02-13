package com.example.cv01;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final Greeter greeter;

    public MyController() {
        this.greeter = new Greeter();
    }

    public String sayHello() {
        return greeter.sayGreeting();
    }
}
