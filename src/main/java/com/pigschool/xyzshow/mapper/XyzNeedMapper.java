package com.pigschool.xyzshow.mapper;

import com.pigschool.xyzshow.model.XyzNeed;
import com.pigschool.xyzshow.model.XyzNeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XyzNeedMapper {
    int countByExample(XyzNeedExample example);

    int deleteByExample(XyzNeedExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XyzNeed record);

    int insertSelective(XyzNeed record);

    List<XyzNeed> selectByExample(XyzNeedExample example);

    XyzNeed selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XyzNeed record, @Param("example") XyzNeedExample example);

    int updateByExample(@Param("record") XyzNeed record, @Param("example") XyzNeedExample example);

    int updateByPrimaryKeySelective(XyzNeed record);

    int updateByPrimaryKey(XyzNeed record);
}