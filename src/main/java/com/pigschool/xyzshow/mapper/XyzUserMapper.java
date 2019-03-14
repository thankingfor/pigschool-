package com.pigschool.xyzshow.mapper;

import com.pigschool.xyzshow.model.XyzUser;
import com.pigschool.xyzshow.model.XyzUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XyzUserMapper {
    int countByExample(XyzUserExample example);

    int deleteByExample(XyzUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XyzUser record);

    int insertSelective(XyzUser record);

    List<XyzUser> selectByExample(XyzUserExample example);

    XyzUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XyzUser record, @Param("example") XyzUserExample example);

    int updateByExample(@Param("record") XyzUser record, @Param("example") XyzUserExample example);

    int updateByPrimaryKeySelective(XyzUser record);

    int updateByPrimaryKey(XyzUser record);
}