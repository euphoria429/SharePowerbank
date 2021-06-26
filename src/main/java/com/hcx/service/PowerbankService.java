package com.hcx.service;

import com.hcx.bean.Powerbank;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:43
 */
public interface PowerbankService {
    public int countByCupId(int cupId);
    Powerbank selectOne(int cupId);
    int lentStatus(Integer pobkId);//取出更新充电宝信息

    int avaliStatus(int cup_id, int pobk_id);

    int putUpdate(int cup_id);//投放：new pobk记录柜子id，状态为available

    List<Powerbank> selectAllByCupId(int cup_id);//查找某一柜子的所有充电宝

    int recycleUpdate(int pobk_id);//回收：根据pobk_id把状态改成recycle，柜子id改成0
}
