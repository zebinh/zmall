package io.github.zebinh.zmall.mall.portal.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("portal")
public class DemoController {

    @GetMapping("demo")
    public String hello(){
        return "hello portal demo";
    }
}
