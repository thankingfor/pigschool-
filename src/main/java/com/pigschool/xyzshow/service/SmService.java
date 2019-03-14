package com.pigschool.xyzshow.service;

import com.pigschool.xyzshow.model.XyzNeed;
import com.pigschool.xyzshow.model.XyzNeedFav;

import java.util.List;

/**
 * @author lyf
 * @create 2019-03-10 13:03
 */
public interface SmService {
    int publishInsert(XyzNeed need);

    List<XyzNeed> search(String param);

    XyzNeed findNeedById(Long needId);

    List<XyzNeed> findNeedByType(int i);

    int insertFav(XyzNeedFav needFav);

    List<XyzNeed> findNeedByUserId(Long id);

    List<XyzNeed> findNeedByUserIdAndType(Long id, int i);

    List<XyzNeedFav> findNeedFavByUserIdAndType(Long userId, int type);

    int needfavdel(Long favId);

    List<XyzNeedFav> findNeedFavByNeedIdAndType(Long needId, int type);
}
