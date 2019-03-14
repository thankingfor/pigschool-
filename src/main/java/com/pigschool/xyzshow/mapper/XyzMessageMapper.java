package com.pigschool.xyzshow.mapper;

import com.pigschool.xyzshow.model.XyzMessage;
import com.pigschool.xyzshow.model.XyzMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XyzMessageMapper {
    int countByExample(XyzMessageExample example);

    int deleteByExample(XyzMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XyzMessage record);

    int insertSelective(XyzMessage record);

    List<XyzMessage> selectByExample(XyzMessageExample example);

    XyzMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XyzMessage record, @Param("example") XyzMessageExample example);

    int updateByExample(@Param("record") XyzMessage record, @Param("example") XyzMessageExample example);

    int updateByPrimaryKeySelective(XyzMessage record);

    int updateByPrimaryKey(XyzMessage record);
}