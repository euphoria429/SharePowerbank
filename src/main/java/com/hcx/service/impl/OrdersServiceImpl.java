package com.hcx.service.impl;

import com.hcx.bean.Orders;
import com.hcx.bean.OrdersExample;
import com.hcx.dao.OrdersMapper;
import com.hcx.service.OrdersService;
import com.hcx.tool.calDate;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public int countReturnOrder(int id) {
        OrdersExample example=new OrdersExample();
        OrdersExample.Criteria criteria=example.createCriteria();
        criteria.andOrderUseridEqualTo(id);
        criteria.andOrderStatusEqualTo("未归还");
        return ordersMapper.countByExample(example);
    }

    public List<Orders> selectNotReturn(int userid) {
        OrdersExample example=new OrdersExample();
        OrdersExample.Criteria criteria=example.createCriteria();
        criteria.andOrderUseridEqualTo(userid);
        criteria.andOrderStatusEqualTo("未归还");
        return ordersMapper.selectByExample(example);
    }

    public int calOrder(int order_id) throws ParseException {
        Orders orders=ordersMapper.selectByPrimaryKey(order_id);
        String createDate=orders.getOrderCreatetime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = formatter.parse(createDate);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time2=simpleDateFormat.format(new Date());
        Date date2=formatter.parse(time2);
        calDate cal=new calDate();
        int dif=cal.dateDiff(date1,date2);
        if(dif==0){
            dif=1;
        }//一小时内一块钱
//        System.out.println(time2);

        OrdersExample example=new OrdersExample();
        OrdersExample.Criteria criteria=example.createCriteria();
        criteria.andOrderIdEqualTo(order_id);
        Orders orders1=new Orders();
        orders1.setOrderFinishtime(time2);
        orders1.setOrderCost(dif);
        orders1.setOrderStatus("未支付");
        return ordersMapper.updateByExampleSelective(orders1,example);
    }

    public Orders selectByOrderId(Integer orderId) {
        return ordersMapper.selectByPrimaryKey(orderId);
    }

    public int payOrder(int order_id) {
        OrdersExample example=new OrdersExample();
        OrdersExample.Criteria criteria=example.createCriteria();
        criteria.andOrderIdEqualTo(order_id);
        Orders orders=new Orders();
        orders.setOrderStatus("已支付");
        return ordersMapper.updateByExampleSelective(orders,example);
    }

    public int delOrderByOrderId(int order_id) {
        return ordersMapper.deleteByPrimaryKey(order_id);
    }

    public int adminChangeCost(int order_id, int cost) {
        OrdersExample example=new OrdersExample();
        OrdersExample.Criteria criteria=example.createCriteria();
        criteria.andOrderIdEqualTo(order_id);
        Orders orders=new Orders();
        orders.setOrderCost(cost);
        return ordersMapper.updateByExampleSelective(orders,example);
    }

}
