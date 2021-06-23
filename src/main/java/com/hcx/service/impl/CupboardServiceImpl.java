package com.hcx.service.impl;

import com.hcx.bean.Cupboard;
import com.hcx.bean.CupboardExample;
import com.hcx.dao.CupboardMapper;
import com.hcx.service.CupboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/22  16:31
 */
@Service(value = "cupboardService")
public class CupboardServiceImpl implements CupboardService {
    @Autowired
    private CupboardMapper cupboardMapper;

    public List<Cupboard> selectByExample(CupboardExample example) {
        return cupboardMapper.selectByExample(null);
    }
}
