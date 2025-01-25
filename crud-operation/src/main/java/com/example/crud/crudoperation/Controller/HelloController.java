package com.example.crud.crudoperation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public String helloMaruf() {
        return "Hi Maruf";
    }
}
