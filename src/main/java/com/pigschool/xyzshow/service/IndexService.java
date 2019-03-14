package com.pigschool.xyzshow.service;

import com.pigschool.xyzshow.common.JsonReturn;
import com.pigschool.xyzshow.model.*;

import java.util.List;

/**
 * @author lyf
 * @create 2019-03-05 19:24
 */
public interface IndexService {
    JsonReturn upItem(XyzItem item);

    List<XyzItem> searchItem(String param);

    XyzItem findItemById(Long path);

    XyzUser findUserByUid(Long uid);

    int iwangt(XyzExchange exchange);

    int leavemessage(XyzMessage message);

    List<XyzMessage> findMessage(Long id);

    int itemfavorite(XyzFavorite favorite);

    XyzFavorite findFavoriteByUserIdAndItemId(Long userId, Long ItemId);

    int itemNofavorite(XyzFavorite favorite);

    int Noiwant(XyzExchange exchange);

    XyzExchange findExchangeByUserIdAndItemId(Long userId, Long ItemId);

    int useredit(XyzUser user);

    List<XyzItem> findItemListByUserId(Long id);

    List<XyzFavorite> findFavoriteByUserId(Long id);

    List<XyzContent> findContentByCID(Long cid);

    List<XyzExchange> findExchangeByUserId(Long id);

    int exchangedel(Long changeId);

    int favdel(Long favId);
}
