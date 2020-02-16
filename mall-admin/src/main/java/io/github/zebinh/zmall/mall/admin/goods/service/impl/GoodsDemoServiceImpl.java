package io.github.zebinh.zmall.mall.admin.goods.service.impl;

import io.github.zebinh.zmall.mall.admin.goods.feign.GoodsDemoFeign;
import io.github.zebinh.zmall.mall.admin.goods.service.GoodsDemoService;
import io.github.zebinh.zmall.mall.goods.api.vo.DemoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsDemoServiceImpl implements GoodsDemoService {

    @Autowired
    private GoodsDemoFeign demoFeign;

    @Override
    public DemoVo getDemo() {
        return demoFeign.hello();
    }
}
