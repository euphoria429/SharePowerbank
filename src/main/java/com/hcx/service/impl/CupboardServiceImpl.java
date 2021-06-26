package com.hcx.service.impl;

import com.hcx.bean.Cupboard;
import com.hcx.bean.CupboardExample;
import com.hcx.dao.CupboardMapper;
import com.hcx.service.CupboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/22  16:31
 */
@Service(value = "cupboardService")
public class CupboardServiceImpl implements CupboardService {
    @Autowired
    private CupboardMapper cupboardMapper;

    public List<Cupboard> selectAll(CupboardExample example) {
        return cupboardMapper.selectByExample(null);
    }

    public Cupboard selectByPrimaryKey(Integer cupboardId) {
        return cupboardMapper.selectByPrimaryKey(cupboardId);
    }
//    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
//    @MyLog(value = "柜子数量")
    public int findAvailable(int id) {
        return cupboardMapper.selectByPrimaryKey(id).getPobkAvailableNum();
    }

    public int findTotal(int id) {
        return cupboardMapper.selectByPrimaryKey(id).getPobkNum();
    }

    public int lentupdate(Integer cupboardId) {
        int num=findAvailable(cupboardId)-1;//可用数量-1
        CupboardExample example=new CupboardExample();
        CupboardExample.Criteria criteria=example.createCriteria();
        criteria.andCupboardIdEqualTo(cupboardId);
        Cupboard cupboard=new Cupboard();
        cupboard.setPobkAvailableNum(num);
        return cupboardMapper.updateByExampleSelective(cupboard,example);
    }

    public int avaliUpdate(int cup_id) {
        int num=findAvailable(cup_id)+1;//可用数量+1
        CupboardExample example=new CupboardExample();
        CupboardExample.Criteria criteria=example.createCriteria();
        criteria.andCupboardIdEqualTo(cup_id);
        Cupboard cupboard=new Cupboard();
        cupboard.setPobkAvailableNum(num);
        return cupboardMapper.updateByExampleSelective(cupboard,example);
    }

    public int putUpdate(int cup_id) {
        //投放后总数,可用数+1
        avaliUpdate(cup_id);//可用数+1
        int num=findTotal(cup_id)+1;//总数+1
        CupboardExample example=new CupboardExample();
        CupboardExample.Criteria criteria=example.createCriteria();
        criteria.andCupboardIdEqualTo(cup_id);
        Cupboard cupboard=new Cupboard();
        cupboard.setPobkNum(num);
        return cupboardMapper.updateByExampleSelective(cupboard,example);
    }

    public int recycleUpdate(int cup_id) {
        //回收后总数,可用数-1
        lentupdate(cup_id);//可用数-1
        int num=findTotal(cup_id)-1;//总数-1
        CupboardExample example=new CupboardExample();
        CupboardExample.Criteria criteria=example.createCriteria();
        criteria.andCupboardIdEqualTo(cup_id);
        Cupboard cupboard=new Cupboard();
        cupboard.setPobkNum(num);
        return cupboardMapper.updateByExampleSelective(cupboard,example);
    }


}
