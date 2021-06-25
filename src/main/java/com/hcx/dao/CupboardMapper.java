package com.hcx.dao;

import com.hcx.bean.Cupboard;
import com.hcx.bean.CupboardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CupboardMapper {
    int countByExample(CupboardExample example);

    int deleteByExample(CupboardExample example);

    int deleteByPrimaryKey(Integer cupboardId);

    int insert(Cupboard record);

    int insertSelective(Cupboard record);

    List<Cupboard> selectByExample(CupboardExample example);

    Cupboard selectByPrimaryKey(Integer cupboardId);

    int updateByExampleSelective(@Param("record") Cupboard record, @Param("example") CupboardExample example);

    int updateByExample(@Param("record") Cupboard record, @Param("example") CupboardExample example);

    int updateByPrimaryKeySelective(Cupboard record);

    int updateByPrimaryKey(Cupboard record);


}