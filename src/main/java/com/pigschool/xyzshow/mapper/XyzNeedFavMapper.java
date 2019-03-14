package com.pigschool.xyzshow.mapper;

import com.pigschool.xyzshow.model.XyzNeedFav;
import com.pigschool.xyzshow.model.XyzNeedFavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XyzNeedFavMapper {
    int countByExample(XyzNeedFavExample example);

    int deleteByExample(XyzNeedFavExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XyzNeedFav record);

    int insertSelective(XyzNeedFav record);

    List<XyzNeedFav> selectByExample(XyzNeedFavExample example);

    XyzNeedFav selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XyzNeedFav record, @Param("example") XyzNeedFavExample example);

    int updateByExample(@Param("record") XyzNeedFav record, @Param("example") XyzNeedFavExample example);

    int updateByPrimaryKeySelective(XyzNeedFav record);

    int updateByPrimaryKey(XyzNeedFav record);
}