package io.github.zebinh.zmall.mall.goods.api.provider.controller;

import io.github.zebinh.zmall.mall.goods.api.api.DemoApi;
import io.github.zebinh.zmall.mall.goods.api.vo.DemoVo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements DemoApi {

    @Override
    public DemoVo hello() {
        DemoVo vo = new DemoVo();
        vo.setMessage("hello mall goods provider demo");
        return vo;
    }
}
