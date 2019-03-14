package com.pigschool.xyzshow.mapper;

import com.pigschool.xyzshow.model.XyzItem;
import com.pigschool.xyzshow.model.XyzItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XyzItemMapper {
    int countByExample(XyzItemExample example);

    int deleteByExample(XyzItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XyzItem record);

    int insertSelective(XyzItem record);

    List<XyzItem> selectByExample(XyzItemExample example);

    XyzItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XyzItem record, @Param("example") XyzItemExample example);

    int updateByExample(@Param("record") XyzItem record, @Param("example") XyzItemExample example);

    int updateByPrimaryKeySelective(XyzItem record);

    int updateByPrimaryKey(XyzItem record);
}