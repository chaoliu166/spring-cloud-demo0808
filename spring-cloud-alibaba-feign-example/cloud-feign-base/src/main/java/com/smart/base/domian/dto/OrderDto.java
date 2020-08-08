package com.smart.base.domian.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderDto {
    private Integer orderId;
    private String orderNo;
    private Date createDate;
    private Integer status;
    private Long total;
    private Long memberId;
}