package com.stulsoft.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BinConfiguration {
    private static BinConfiguration instance;

    @Autowired
    private SomeService someService;

    public BinConfiguration() {
        System.out.println("==>BinConfiguration");
        instance = this;
    }

    public static SomeService someService() {
        return instance.someService;
    }
}
