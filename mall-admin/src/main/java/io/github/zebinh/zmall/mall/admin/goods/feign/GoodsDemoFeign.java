package io.github.zebinh.zmall.mall.admin.goods.feign;

import io.github.zebinh.zmall.mall.goods.api.api.DemoApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "mall-goods", url = "http://localhost:9000")
public interface GoodsDemoFeign extends DemoApi {
}
