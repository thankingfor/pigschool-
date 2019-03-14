package com.pigschool.xyzshow.mapper;

import com.pigschool.xyzshow.model.XyzFavorite;
import com.pigschool.xyzshow.model.XyzFavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XyzFavoriteMapper {
    int countByExample(XyzFavoriteExample example);

    int deleteByExample(XyzFavoriteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XyzFavorite record);

    int insertSelective(XyzFavorite record);

    List<XyzFavorite> selectByExample(XyzFavoriteExample example);

    XyzFavorite selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XyzFavorite record, @Param("example") XyzFavoriteExample example);

    int updateByExample(@Param("record") XyzFavorite record, @Param("example") XyzFavoriteExample example);

    int updateByPrimaryKeySelective(XyzFavorite record);

    int updateByPrimaryKey(XyzFavorite record);
}