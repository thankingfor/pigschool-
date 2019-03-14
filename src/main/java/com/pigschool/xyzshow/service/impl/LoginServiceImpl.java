package com.pigschool.xyzshow.service.impl;


import com.pigschool.xyzshow.common.CommonStatus;
import com.pigschool.xyzshow.common.JsonReturn;
import com.pigschool.xyzshow.mapper.XyzUserMapper;
import com.pigschool.xyzshow.model.XyzUser;
import com.pigschool.xyzshow.model.XyzUserExample;
import com.pigschool.xyzshow.service.LoginService;
import com.pigschool.xyzshow.util.BzsyUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService{

    @Override
    public JsonReturn register(XyzUser user) {
        int i = userMapper.insertSelective(user);
        if (i <= 0){
            return JsonReturn.fail(CommonStatus.FAULT);
        }
        log.info("i="+i);
        return JsonReturn.success();
    }

    @Override
    public XyzUser findByUsername(XyzUser user) {
        log.info(user.toString());
        XyzUserExample example = new XyzUserExample();
        XyzUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        List<XyzUser> list = userMapper.selectByExample(example);
        if (BzsyUtils.isNotEmpty(list)){
            return list.get(0);
        }
        return null;
    }

    @Autowired
    private XyzUserMapper userMapper;

}
