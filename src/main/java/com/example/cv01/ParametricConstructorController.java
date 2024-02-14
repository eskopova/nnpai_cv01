package com.example.cv01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ParametricConstructorController {
    private final Greeter greeter;

    @Autowired
    public ParametricConstructorController(Greeter greeter) {
        this.greeter = greeter;
    }

    public String sayHello() {
        return greeter.sayGreeting();
    }
}
