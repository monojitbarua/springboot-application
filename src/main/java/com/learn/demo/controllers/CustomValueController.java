package com.learn.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


//This controller is to test that application is able to read from application.properties and application.yaml at the same time without any extra setting
@RestController
public class CustomValueController {

    @Value("${my.custom.field1}")
    private String customField1;

    @Value("${my.custom.field2}")
    private String customField2;

    @GetMapping
    @RequestMapping("/")
    public Map getFields() {
        Map m = new HashMap<String, String>();
        m.put("field1", customField1);
        m.put("field2", customField2);
        return m;
    }
}
