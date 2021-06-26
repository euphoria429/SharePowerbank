package com.hcx.service;

import com.hcx.bean.Cupboard;
import com.hcx.bean.CupboardExample;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:42
 */
public interface CupboardService {
    List<Cupboard> selectAll(CupboardExample example);
    Cupboard selectByPrimaryKey(Integer cupboardId);
    int findAvailable(int id);//查询可用充电宝数量
    int findTotal(int id);//查询总数

    int lentupdate(Integer cupboardId);//借出后可用数量-1
    int avaliUpdate(int cup_id);//归还后可用数量+1

    int putUpdate(int cup_id);//投放后总数,可用数+1
    int recycleUpdate(int cup_id);//回收后总数，可用数-1
}
