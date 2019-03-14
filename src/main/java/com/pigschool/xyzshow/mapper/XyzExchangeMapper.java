package com.pigschool.xyzshow.mapper;

import com.pigschool.xyzshow.model.XyzExchange;
import com.pigschool.xyzshow.model.XyzExchangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XyzExchangeMapper {
    int countByExample(XyzExchangeExample example);

    int deleteByExample(XyzExchangeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XyzExchange record);

    int insertSelective(XyzExchange record);

    List<XyzExchange> selectByExample(XyzExchangeExample example);

    XyzExchange selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XyzExchange record, @Param("example") XyzExchangeExample example);

    int updateByExample(@Param("record") XyzExchange record, @Param("example") XyzExchangeExample example);

    int updateByPrimaryKeySelective(XyzExchange record);

    int updateByPrimaryKey(XyzExchange record);
}