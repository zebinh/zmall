package io.github.zebinh.zmall.mall.goods.api.api;

import io.github.zebinh.zmall.mall.goods.api.vo.DemoVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("goods/demo")
public interface DemoApi {


    @GetMapping("hello")
    DemoVo hello();

}
