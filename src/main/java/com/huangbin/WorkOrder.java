package com.huangbin;

import com.huangbin.base.BaseEntity;
import com.huangbin.location.Location;
import lombok.Data;

import java.util.Date;

/**
 * 工单信息
 */
@Data
public class WorkOrder extends BaseEntity {
    private String orderId; //工单编号
    private Long locationId; // 位置ID
    private Long categoryId;//设备种类id
    private String orderDesc; //工单描述
    private String reporter;//报修人
    private Date reportTime; //报修时间
    private String orderStatus;//工单状态
}
