package com.trong.testvsc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String HelloWorld() {
        return "helloWorld";
    }
    

}
