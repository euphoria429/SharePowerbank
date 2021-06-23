package com.hcx.service;

import com.hcx.bean.Order;
import com.hcx.bean.OrderExample;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:42
 */
public interface OrderService {
    public List<Order> selectByUserId(int userid);
    List<Order> selectAll();
}
