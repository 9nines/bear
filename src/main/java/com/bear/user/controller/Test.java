package com.bear.user.controller;

import com.bear.user.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    @Autowired
    private TestService testService;

    public void print() {
        System.out.println(testService.isTrue());
    }
}
