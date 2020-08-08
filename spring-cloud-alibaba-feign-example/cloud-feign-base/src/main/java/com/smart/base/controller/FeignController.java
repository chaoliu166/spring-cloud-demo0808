package com.smart.base.controller;

import com.smart.base.domian.dto.request.OrderRequestParams;
import com.smart.base.service.BaseServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangwei
 */ //http://127.0.0.1:8889/api/feign/create
@RestController
@RequestMapping("/feign")
@Slf4j
public class FeignController {
    @Resource
    BaseServices baseServices;
    // 网关


    //http://127.0.0.1:8889/api/feign/create
    @PostMapping("/create")
    public String createOrder(@RequestBody OrderRequestParams requestParams) {
        log.info(requestParams.toString());
        return baseServices.createOrder(requestParams);
    }

}
