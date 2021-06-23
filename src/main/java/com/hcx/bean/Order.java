package com.hcx.bean;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer orderUserId;

    private Integer orderLentCupboardId;

    private Integer orderPobkId;

    private Date orderCreateTime;

    private Integer orderRevertLocationId;

    private Date orderFinishTime;

    private Integer orderCostId;

    private Integer orderHasFinished;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Integer getOrderLentCupboardId() {
        return orderLentCupboardId;
    }

    public void setOrderLentCupboardId(Integer orderLentCupboardId) {
        this.orderLentCupboardId = orderLentCupboardId;
    }

    public Integer getOrderPobkId() {
        return orderPobkId;
    }

    public void setOrderPobkId(Integer orderPobkId) {
        this.orderPobkId = orderPobkId;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Integer getOrderRevertLocationId() {
        return orderRevertLocationId;
    }

    public void setOrderRevertLocationId(Integer orderRevertLocationId) {
        this.orderRevertLocationId = orderRevertLocationId;
    }

    public Date getOrderFinishTime() {
        return orderFinishTime;
    }

    public void setOrderFinishTime(Date orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }

    public Integer getOrderCostId() {
        return orderCostId;
    }

    public void setOrderCostId(Integer orderCostId) {
        this.orderCostId = orderCostId;
    }

    public Integer getOrderHasFinished() {
        return orderHasFinished;
    }

    public void setOrderHasFinished(Integer orderHasFinished) {
        this.orderHasFinished = orderHasFinished;
    }
}