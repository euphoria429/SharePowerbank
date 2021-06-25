package com.hcx.dao;

import com.hcx.bean.Powerbank;
import com.hcx.bean.PowerbankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerbankMapper {
    int countByExample(PowerbankExample example);

    int deleteByExample(PowerbankExample example);

    int deleteByPrimaryKey(Integer pobkId);

    int insert(Powerbank record);

    int insertSelective(Powerbank record);

    List<Powerbank> selectByExample(PowerbankExample example);

    Powerbank selectByPrimaryKey(Integer pobkId);

    int updateByExampleSelective(@Param("record") Powerbank record, @Param("example") PowerbankExample example);

    int updateByExample(@Param("record") Powerbank record, @Param("example") PowerbankExample example);

    int updateByPrimaryKeySelective(Powerbank record);

    int updateByPrimaryKey(Powerbank record);

    Powerbank selectOne(Integer id);


}