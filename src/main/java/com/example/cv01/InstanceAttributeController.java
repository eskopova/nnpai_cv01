package com.example.cv01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InstanceAttributeController {
    @Autowired
    private Greeter greeter;

    public String sayHello() {
        return greeter.sayGreeting();
    }
}
