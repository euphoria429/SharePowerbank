package com.hcx.dao;

import com.hcx.bean.Cost;
import com.hcx.bean.CostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostMapper {
    int countByExample(CostExample example);

    int deleteByExample(CostExample example);

    int deleteByPrimaryKey(Integer costId);

    int insert(Cost record);

    int insertSelective(Cost record);

    List<Cost> selectByExample(CostExample example);

    Cost selectByPrimaryKey(Integer costId);

    int updateByExampleSelective(@Param("record") Cost record, @Param("example") CostExample example);

    int updateByExample(@Param("record") Cost record, @Param("example") CostExample example);

    int updateByPrimaryKeySelective(Cost record);

    int updateByPrimaryKey(Cost record);
}