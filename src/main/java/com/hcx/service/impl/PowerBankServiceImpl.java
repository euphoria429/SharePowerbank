package com.hcx.service.impl;

import com.hcx.bean.Powerbank;
import com.hcx.bean.PowerbankExample;
import com.hcx.dao.PowerbankMapper;
import com.hcx.service.PowerbankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/22  16:32
 */
@Service(value = "powerbankService")
public class PowerBankServiceImpl implements PowerbankService {
    @Autowired
    private PowerbankMapper powerbankMapper;
    public int countByCupId(int cupId) {
        PowerbankExample example=new PowerbankExample();
        PowerbankExample.Criteria criteria=example.createCriteria();
        criteria.andPobkCupboardIdEqualTo(cupId);
        return powerbankMapper.countByExample(example);
    }

    public Powerbank selectOne(int cupId) {
        return powerbankMapper.selectOne(cupId);
    }

    public int lentStatus(Integer pobkId) {
//        PowerbankExample example=new PowerbankExample();
//        PowerbankExample.Criteria criteria=example.createCriteria();
//        criteria.andPobkIdEqualTo(pobkId);
        Powerbank powerbank=new Powerbank();
        powerbank.setPobkId(pobkId);
        powerbank.setPobkCupboardId(0);
        powerbank.setPobkStatus("lent");
        return powerbankMapper.updateByPrimaryKey(powerbank);
    }

    public int avaliStatus(int cup_id, int pobk_id) {
        Powerbank powerbank=new Powerbank();
        powerbank.setPobkId(pobk_id);
        powerbank.setPobkCupboardId(cup_id);
        powerbank.setPobkStatus("available");
        return powerbankMapper.updateByPrimaryKey(powerbank);
    }
}
