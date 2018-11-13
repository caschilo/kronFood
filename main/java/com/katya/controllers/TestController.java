package com.katya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Sony on 13.11.2018.
 */
@Controller
public class TestController {

    @GetMapping("/exp")
    public String exp(Map<String, Object> model) {
        model.put("name", "Admin");
        return "exp";
    }
}
