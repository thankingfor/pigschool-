package com.pigschool.xyzshow.service;

import com.pigschool.xyzshow.common.JsonReturn;
import com.pigschool.xyzshow.model.XyzUser;

public interface LoginService {

    JsonReturn register(XyzUser user);

    XyzUser findByUsername(XyzUser user);
}
