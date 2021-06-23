package com.hcx.service.impl;

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
    public int countByCupId(int CupId) {
        PowerbankExample example=new PowerbankExample();
        PowerbankExample.Criteria criteria=example.createCriteria();
        criteria.andPobkCupboardIdEqualTo(CupId);
        return powerbankMapper.countByExample(example);
    }
}
