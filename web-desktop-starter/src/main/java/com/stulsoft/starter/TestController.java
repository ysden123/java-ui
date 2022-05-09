package com.stulsoft.starter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @PostMapping("/ttt")
    public String test(){
        System.out.println("Here!!!");
        return "Test response";
    }
}
