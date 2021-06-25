package com.hcx.service.impl;

import com.hcx.bean.Orders;
import com.hcx.bean.OrdersExample;
import com.hcx.dao.OrdersMapper;
import com.hcx.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/22  16:32
 */
@Service(value = "ordersService")
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    public List<Orders> selectByUserId(int userid) {
        OrdersExample example=new OrdersExample();
        OrdersExample.Criteria criteria=example.createCriteria();
        criteria.andOrderUseridEqualTo(userid);
        return ordersMapper.selectByExample(example);
    }

    public List<Orders> selectAll() {
        return ordersMapper.selectByExample(null);
    }

    public int countById(int id) {
        OrdersExample example=new OrdersExample();
        OrdersExample.Criteria criteria=example.createCriteria();
        criteria.andOrderUseridEqualTo(id);
        return ordersMapper.countByExample(example);
    }

    public int countAll() {
        return ordersMapper.countByExample(null);
    }

    public int createOrder(Orders orders) {
        return ordersMapper.insert(orders);
    }

}
