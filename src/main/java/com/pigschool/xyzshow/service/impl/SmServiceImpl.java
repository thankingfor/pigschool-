package com.pigschool.xyzshow.service.impl;

import com.pigschool.xyzshow.mapper.XyzNeedFavMapper;
import com.pigschool.xyzshow.mapper.XyzNeedMapper;
import com.pigschool.xyzshow.mapper.XyzUserMapper;
import com.pigschool.xyzshow.model.*;
import com.pigschool.xyzshow.service.SmService;
import com.pigschool.xyzshow.util.BzsyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lyf
 * @create 2019-03-10 13:04
 */
@Service
public class SmServiceImpl implements SmService {

    @Override
    public int publishInsert(XyzNeed need) {
        return needMapper.insertSelective(need);
    }

    @Override
    public List<XyzNeed> search(String param) {
        XyzNeedExample example = new XyzNeedExample();
        XyzNeedExample.Criteria criteria = example.createCriteria();
        criteria.andTitleLike("%"+param+"%");
        XyzNeedExample.Criteria criteria1 = example.or();
        criteria1.andXyzDescLike("%"+param+"%");
        List<XyzNeed> xyzNeeds = needMapper.selectByExample(example);
        return xyzNeeds;
    }

    @Override
    public XyzNeed findNeedById(Long needId) {
        XyzNeed need = needMapper.selectByPrimaryKey(needId);
        return need;
    }

    @Override
    public List<XyzNeed> findNeedByType(int i) {
        XyzNeedExample example = new XyzNeedExample();
        XyzNeedExample.Criteria criteria = example.createCriteria();
        criteria.andXyzTypeEqualTo(i);
        List<XyzNeed> list = needMapper.selectByExample(example);
        return list;
    }

    @Override
    public int insertFav(XyzNeedFav needFav) {
        XyzNeedFavExample example = new XyzNeedFavExample();
        XyzNeedFavExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(needFav.getUserId());
        criteria.andNeedIdEqualTo(needFav.getNeedId());
        criteria.andNeedTypeEqualTo(needFav.getNeedType());
        List<XyzNeedFav> xyzNeedFavs = needfavMapper.selectByExample(example);
        if (BzsyUtils.isNotEmpty(xyzNeedFavs)){
            return 2;
        }
        return needfavMapper.insertSelective(needFav);
    }

    @Override
    public List<XyzNeed> findNeedByUserId(Long id) {
        XyzNeedExample example = new XyzNeedExample();
        XyzNeedExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<XyzNeed> xyzNeedList = needMapper.selectByExample(example);
        return xyzNeedList;
    }

    @Override
    public List<XyzNeed> findNeedByUserIdAndType(Long id, int i) {
        XyzNeedExample example = new XyzNeedExample();
        XyzNeedExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        criteria.andXyzTypeEqualTo(i);
        List<XyzNeed> xyzNeedList = needMapper.selectByExample(example);
        return xyzNeedList;
    }

    @Override
    public List<XyzNeedFav> findNeedFavByUserIdAndType(Long userId, int type) {
        XyzNeedFavExample example = new XyzNeedFavExample();
        XyzNeedFavExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andNeedTypeEqualTo(type);
        List<XyzNeedFav> xyzNeedFavs = needfavMapper.selectByExample(example);
        for (XyzNeedFav fav:xyzNeedFavs) {
            XyzNeed need = needMapper.selectByPrimaryKey(fav.getNeedId());
            fav.setNeed(need);
            XyzUser user = userMapper.selectByPrimaryKey(need.getUserId());
            fav.setUser(user);
        }
        return xyzNeedFavs;
    }

    @Override
    public int needfavdel(Long favId) {
        return needfavMapper.deleteByPrimaryKey(favId);
    }

    @Override
    public List<XyzNeedFav> findNeedFavByNeedIdAndType(Long needId, int type) {
        XyzNeedFavExample example = new XyzNeedFavExample();
        XyzNeedFavExample.Criteria criteria = example.createCriteria();
        criteria.andNeedIdEqualTo(needId);
        criteria.andNeedTypeEqualTo(type);
        List<XyzNeedFav> list = needfavMapper.selectByExample(example);
        for (XyzNeedFav fav:list) {
            XyzNeed need = needMapper.selectByPrimaryKey(fav.getNeedId());
            fav.setNeed(need);
            XyzUser user = userMapper.selectByPrimaryKey(fav.getUserId());
            fav.setUser(user);
        }
        return list;
    }

    @Autowired
    private XyzUserMapper userMapper;

    @Autowired
    private XyzNeedFavMapper needfavMapper;

    @Autowired
    private XyzNeedMapper needMapper;
}
