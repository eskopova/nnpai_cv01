package com.example.cv01;

import org.springframework.stereotype.Controller;

@Controller
public class SetParameterController {
    private Greeter greeter;

    public SetParameterController() {
    }

    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    public String sayHello() {
        return greeter.sayGreeting();
    }
}
