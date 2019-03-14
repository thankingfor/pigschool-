package com.pigschool.xyzshow.mapper;

import com.pigschool.xyzshow.model.XyzContent;
import com.pigschool.xyzshow.model.XyzContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XyzContentMapper {
    int countByExample(XyzContentExample example);

    int deleteByExample(XyzContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XyzContent record);

    int insertSelective(XyzContent record);

    List<XyzContent> selectByExampleWithBLOBs(XyzContentExample example);

    List<XyzContent> selectByExample(XyzContentExample example);

    XyzContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XyzContent record, @Param("example") XyzContentExample example);

    int updateByExampleWithBLOBs(@Param("record") XyzContent record, @Param("example") XyzContentExample example);

    int updateByExample(@Param("record") XyzContent record, @Param("example") XyzContentExample example);

    int updateByPrimaryKeySelective(XyzContent record);

    int updateByPrimaryKeyWithBLOBs(XyzContent record);

    int updateByPrimaryKey(XyzContent record);
}