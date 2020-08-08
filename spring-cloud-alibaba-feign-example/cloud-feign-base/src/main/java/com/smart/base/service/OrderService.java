package com.smart.base.service;

import com.smart.base.domian.dto.OrderDto;
import com.smart.base.domian.dto.request.OrderRequestParams;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 控制层
 * 接受请求
 * 响应数据
 * <p>
 * value  服务的名称
 * path  指控制层跟路径
 * <p>
 * http://ip:端口//api/order  baseUrl
 */
@FeignClient(value = "cloud-feign-order-server", path = "/api/order")
public interface OrderService {
    @GetMapping("/")
    public List<OrderDto> getOrderData(@RequestParam(value = "uid") int uid, @RequestParam("page") int page, @RequestParam("size") int size);

    @PostMapping("/save/")
    public String createOrder(@RequestBody OrderRequestParams requestParams);

}
