package io.github.zebinh.zmall.mall.admin.goods.controller;

import io.github.zebinh.zmall.mall.admin.goods.service.GoodsDemoService;
import io.github.zebinh.zmall.mall.goods.api.vo.DemoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/goods")
public class GoodsDemoController {

    @Autowired
    private GoodsDemoService demoService;

    @GetMapping("demo")
    public DemoVo hello(){
        return demoService.getDemo();
    }
}
