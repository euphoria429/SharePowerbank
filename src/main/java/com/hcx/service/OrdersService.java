package com.hcx.service;

import com.hcx.bean.Orders;
import org.aspectj.weaver.ast.Or;

import java.text.ParseException;
import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:42
 */
public interface OrdersService {
    public List<Orders> selectByUserId(int userid);
    List<Orders> selectAll();
    int countById(int id);
    int countAll();
    int createOrder(Orders orders);

    int countReturnOrder(int id);
    List<Orders> selectNotReturn(int userid);

    int calOrder(int order_id) throws ParseException;
    Orders selectByOrderId(Integer orderId);

    int payOrder(int order_id);

    int delOrderByOrderId(int order_id);

    int adminChangeCost(int order_id, int cost);
}
