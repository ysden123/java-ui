package com.stulsoft.starter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @PostMapping("/formTest")
    public String formTest(FormTestRequest req) {
        System.out.println(req);
        return "Done";
    }
}
