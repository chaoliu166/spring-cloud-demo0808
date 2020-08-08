package com.smart.base.service;

import com.smart.base.domian.dto.OrderDto;
import com.smart.base.domian.dto.request.OrderRequestParams;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BaseServices {
    List<OrderDto> getOrderList(int uid, int page, int size);

    String createOrder(@RequestBody OrderRequestParams requestParams);
}
