package com.smart.base.domian.dto.request;

import lombok.Data;

import java.util.List;

/**
 *
 * @author zhangwei
 */
@Data
public class OrderRequestParams extends BaseReqeustParams {
    private int uid;
    private List<Integer> ids;
    private String address;
    private String phone;
    /**
     * 1 表示顺丰
     * 2 圆通
     * 3 中通
     */
    private int expressType;

}
