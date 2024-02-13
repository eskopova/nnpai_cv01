package com.example.cv01;

import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {
    private final Greeter greeter;

    public ConstructorController(Greeter greeter) {
        this.greeter = greeter;
    }

    public String sayHello() {
        return greeter.sayGreeting();
    }
}
