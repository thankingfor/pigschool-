package com.pigschool.xyzshow.service.impl;

import com.pigschool.xyzshow.common.CommonStatus;
import com.pigschool.xyzshow.common.JsonReturn;
import com.pigschool.xyzshow.mapper.*;
import com.pigschool.xyzshow.model.*;
import com.pigschool.xyzshow.service.IndexService;
import com.pigschool.xyzshow.util.BzsyUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.List;


@Slf4j
@Service
public class IndexServiceImpl implements IndexService {

    @Override
    public JsonReturn upItem(XyzItem item) {
        int i = itemMapper.insertSelective(item);
        if (i <= 0){
            return JsonReturn.fail(CommonStatus.FAULT);
        }
        return JsonReturn.success();
    }

    @Override
    public List<XyzItem> searchItem(String param) {
        param = '%'+param+"%";
        XyzItemExample example = new XyzItemExample();
        XyzItemExample.Criteria criteria = example.createCriteria();
        criteria.andTitleLike(param);
        XyzItemExample.Criteria criteria1 = example.or();
        criteria1.andSellPointLike(param);
        List<XyzItem> list = itemMapper.selectByExample(example);
        return list;
    }

    @Override
    public XyzItem findItemById(Long path) {
        return itemMapper.selectByPrimaryKey(path);
    }

    @Override
    public XyzUser findUserByUid(Long uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int iwangt(XyzExchange exchange) {
        XyzExchange xyzExchange = findExchangeByUserIdAndItemId(exchange.getUserId(), exchange.getItemId());
        if (BzsyUtils.isNotEmpty(xyzExchange)){
            return 0;
        }
        return exchangeMapper.insertSelective(exchange);
    }

    @Override
    public int leavemessage(XyzMessage message) {
        return messageMapper.insertSelective(message);
    }

    @Override
    public List<XyzMessage> findMessage(Long id) {
        XyzMessageExample example = new XyzMessageExample();
        XyzMessageExample.Criteria criteria = example.createCriteria();
        criteria.andItemIdEqualTo(id);
        List<XyzMessage> xyzMessages = messageMapper.selectByExample(example);
        for (XyzMessage message: xyzMessages) {
            XyzUser user = userMapper.selectByPrimaryKey(message.getUserId());
            message.setUser(user);
        }
        return xyzMessages;
    }

    /**
     * 收藏添加
     * @param favorite
     * @return
     */
    @Override
    public int itemfavorite(XyzFavorite favorite) {
        XyzFavorite favoriteByUserIdAndItemId = findFavoriteByUserIdAndItemId(favorite.getUserId(), favorite.getItemId());
        if (BzsyUtils.isEmpty(favoriteByUserIdAndItemId)){
            int i = favoriteMapper.insertSelective(favorite);
            return i;
        }
        return 1;
    }

    /**
     * 查询收藏
     * @param userId
     * @param ItemId
     * @return
     */
    @Override
    public XyzFavorite findFavoriteByUserIdAndItemId(Long userId, Long ItemId) {
        XyzFavoriteExample example = new XyzFavoriteExample();
        XyzFavoriteExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andItemIdEqualTo(ItemId);
        List<XyzFavorite> list = favoriteMapper.selectByExample(example);
        if (BzsyUtils.isEmpty(list)){
            return null;
        }
        return list.get(0);
    }

    /**
     * 取消商品的收藏
     * @param favorite
     * @return
     */
    @Override
    public int itemNofavorite(XyzFavorite favorite) {
        XyzFavorite favoriteByUserIdAndItemId = findFavoriteByUserIdAndItemId(favorite.getUserId(), favorite.getItemId());
        if (BzsyUtils.isNotEmpty(favoriteByUserIdAndItemId)){
            int i = favoriteMapper.deleteByPrimaryKey(favoriteByUserIdAndItemId.getId());
            return i;
        }
        return 0;
    }

    /**
     * 取消商品的交换信息
     * @param exchange
     * @return
     */
    @Override
    public int Noiwant(XyzExchange exchange) {
        XyzExchange xyzExchange = findExchangeByUserIdAndItemId(exchange.getUserId(), exchange.getItemId());
        if (BzsyUtils.isNotEmpty(xyzExchange)){
            int i = exchangeMapper.deleteByPrimaryKey(xyzExchange.getId());
            return i;
        }
        return 0;
    }

    /**
     * 查询交换信息
     * @param userId
     * @param ItemId
     * @return
     */
    @Override
    public XyzExchange findExchangeByUserIdAndItemId(Long userId, Long ItemId) {
        XyzExchangeExample example = new XyzExchangeExample();
        XyzExchangeExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andItemIdEqualTo(ItemId);
        List<XyzExchange> list = exchangeMapper.selectByExample(example);
        if (BzsyUtils.isEmpty(list)){
            return null;
        }
        return list.get(0);
    }

    /**
     * 用户修改
     * @param user
     * @return
     */
    @Override
    public int useredit(XyzUser user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 返回用户所有发过的项目
     * @param id
     * @return
     */
    @Override
    public List<XyzItem> findItemListByUserId(Long id) {
        XyzItemExample example = new XyzItemExample();
        XyzItemExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(id);
        List<XyzItem> itemList = itemMapper.selectByExample(example);
        return itemList;
    }

    /**
     * 返回用户喜欢的
     * @param id
     * @return
     */
    @Override
    public List<XyzFavorite> findFavoriteByUserId(Long id) {
        XyzFavoriteExample example = new XyzFavoriteExample();
        XyzFavoriteExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<XyzFavorite> favoriteList = favoriteMapper.selectByExample(example);
        for (XyzFavorite fav:favoriteList) {
            XyzItem item = itemMapper.selectByPrimaryKey(fav.getItemId());
            fav.setItem(item);
            XyzUser user = userMapper.selectByPrimaryKey(fav.getUserId());
            fav.setUser(user);
        }
        return favoriteList;
    }

    /**
     * 获取分类下的所有content
     * @param cid
     * @return
     */
    @Override
    public List<XyzContent> findContentByCID(Long cid) {
        XyzContentExample example = new XyzContentExample();
        example.setOrderByClause("sort ASC,created ASC");
        XyzContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(cid);
        List<XyzContent> list = contentMapper.selectByExample(example);
        for (XyzContent content: list) {
            if (BzsyUtils.isNotEmpty(content.getTitle())){
                XyzItem item = itemMapper.selectByPrimaryKey(Long.valueOf(content.getTitle()));
                content.setItem(item);
            }
        }
        return list;
    }

    /**
     * 返回用户的我想要
     * @param id
     * @return
     */
    @Override
    public List<XyzExchange> findExchangeByUserId(Long id) {
        XyzExchangeExample example = new XyzExchangeExample();
        XyzExchangeExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<XyzExchange> list = exchangeMapper.selectByExample(example);
        for (XyzExchange exchange: list) {
            XyzItem item = itemMapper.selectByPrimaryKey(exchange.getItemId());
            exchange.setItem(item);
            XyzUser user = userMapper.selectByPrimaryKey(exchange.getUserId());
            exchange.setUser(user);
        }
        return list;
    }

    /**
     *  我想要删除
     * @return
     */
    @Override
    public int exchangedel(Long changeId) {
        return exchangeMapper.deleteByPrimaryKey(changeId);
    }

    @Override
    public int favdel(Long favId) {
        return favoriteMapper.deleteByPrimaryKey(favId);
    }

    @Autowired
    private XyzContentMapper contentMapper ;

    @Autowired
    private XyzFavoriteMapper favoriteMapper;

    @Autowired
    private XyzMessageMapper messageMapper;

    @Autowired
    private XyzExchangeMapper exchangeMapper;

    @Autowired
    private XyzItemMapper itemMapper;

    @Autowired
    private XyzUserMapper userMapper;
}
