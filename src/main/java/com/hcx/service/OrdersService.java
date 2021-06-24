package com.hcx.service;

import com.hcx.bean.Orders;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:42
 */
public interface OrdersService {
    public List<Orders> selectByUserId(int userid);
    List<Orders> selectAll();
}
