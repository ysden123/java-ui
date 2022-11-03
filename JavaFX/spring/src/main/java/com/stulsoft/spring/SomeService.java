package com.stulsoft.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    @Autowired
    Environment environment;

    public SomeService() {
        System.out.println("==>SomeService");
    }

    public void makeWork() {
        System.out.println("==>makeWork");
        System.out.printf("test.param1: %s%n", environment.getProperty("test.param1"));
    }
}
