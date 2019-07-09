package me.guozi.springbootjwtdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenyun on 2019-07-09
 */
@RestController
public class HelloWorldController {

    @RequestMapping({"/hello"})
    public String firstPage() {
        return "Hello World";
    }

}
