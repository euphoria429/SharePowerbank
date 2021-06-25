package com.hcx.service;

import com.hcx.bean.Powerbank;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:43
 */
public interface PowerbankService {
    public int countByCupId(int cupId);
    Powerbank selectOne(int cupId);
    int lentStatus(Integer pobkId);//取出更新充电宝信息
}
