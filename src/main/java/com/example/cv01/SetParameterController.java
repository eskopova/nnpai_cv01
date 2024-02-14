package com.example.cv01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetParameterController {
    private Greeter greeter;

    @Autowired
    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    public String sayHello() {
        return greeter.sayGreeting();
    }
}
