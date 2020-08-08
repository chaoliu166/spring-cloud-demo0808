package com.smart.base.service.impl;

import com.smart.base.domian.dto.OrderDto;
import com.smart.base.domian.dto.request.OrderRequestParams;
import com.smart.base.service.BaseServices;
import com.smart.base.service.OrderService;
import feign.Request;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 生成订单
 */
@Service
public class BaseServicesImpl implements BaseServices {
    @Resource
    OrderService orderService;

    @Override
    public List<OrderDto> getOrderList(int uid, int page, int size) {
        return orderService.getOrderData(uid, page, size);
    }

    @Override
    public String createOrder(OrderRequestParams requestParams) {
        return orderService.createOrder(requestParams);
    }


}
