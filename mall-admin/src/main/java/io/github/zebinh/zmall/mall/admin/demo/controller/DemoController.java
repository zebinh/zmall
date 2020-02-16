package io.github.zebinh.zmall.mall.admin.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/demo")
public class DemoController {

    @GetMapping("hello")
    public String helloDemo(){
        return "hello admin demo";
    }
}
