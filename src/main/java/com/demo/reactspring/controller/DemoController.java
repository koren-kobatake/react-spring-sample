package com.demo.reactspring.controller;

import com.demo.reactspring.payload.response.DemoResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DemoController {

    /**
     * Hello World
     */
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public DemoResponse hello() {
        DemoResponse res = new DemoResponse();
        res.setDisplayStr("Hello World");
        return res;
    }
}
