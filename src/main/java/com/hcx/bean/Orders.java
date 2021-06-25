package com.hcx.bean;

public class Orders {
    private Integer orderId;

    private Integer orderUserid;

    private Integer orderPobkid;

    private String orderCreatetime;

    private String orderFinishtime;

    private Integer orderCost;

    private String orderStatus;

    public Orders() {
    }

    public Orders(Integer orderUserid, Integer orderPobkid, String orderCreatetime, String orderStatus) {
        this.orderUserid = orderUserid;
        this.orderPobkid = orderPobkid;
        this.orderCreatetime = orderCreatetime;
        this.orderStatus = orderStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderUserid() {
        return orderUserid;
    }

    public void setOrderUserid(Integer orderUserid) {
        this.orderUserid = orderUserid;
    }

    public Integer getOrderPobkid() {
        return orderPobkid;
    }

    public void setOrderPobkid(Integer orderPobkid) {
        this.orderPobkid = orderPobkid;
    }

    public String getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(String orderCreatetime) {
        this.orderCreatetime = orderCreatetime == null ? null : orderCreatetime.trim();
    }

    public String getOrderFinishtime() {
        return orderFinishtime;
    }

    public void setOrderFinishtime(String orderFinishtime) {
        this.orderFinishtime = orderFinishtime == null ? null : orderFinishtime.trim();
    }

    public Integer getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(Integer orderCost) {
        this.orderCost = orderCost;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }
}