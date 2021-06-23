package com.hcx.service.impl;

import com.hcx.bean.Order;
import com.hcx.bean.OrderExample;
import com.hcx.dao.OrderMapper;
import com.hcx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/22  16:32
 */
@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<Order> selectByUserId(int userid) {
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andOrderUserIdEqualTo(userid);
        return orderMapper.selectByExample(example);
    }

    public List<Order> selectAll() {
        return orderMapper.selectByExample(null);
    }
}
