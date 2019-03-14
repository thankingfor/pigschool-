package com.pigschool.xyzshow.controller;


import com.pigschool.xyzshow.common.CommonStatus;
import com.pigschool.xyzshow.common.JsonReturn;
import com.pigschool.xyzshow.model.XyzUser;
import com.pigschool.xyzshow.service.LoginService;
import com.pigschool.xyzshow.util.BzsyUtils;
import com.pigschool.xyzshow.util.Md5Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = {"/login","/",""},method = RequestMethod.GET)
    public String login(XyzUser user){
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public JsonReturn register(XyzUser user){
        String md5Pwd = Md5Utils.encryptPassword(user.getPassword(),SALT);
        log.info("md5Pwd="+md5Pwd);
        log.info("SALT="+SALT);
        user.setPassword(md5Pwd);
        JsonReturn jsonReturn = loginService.register(user);
        log.info("json=:"+jsonReturn.toJson());

        return jsonReturn;
    }

    @ResponseBody
    @RequestMapping(value = "/up",method = RequestMethod.POST)
    public JsonReturn up(XyzUser user, HttpSession session){
        XyzUser xyzUser = loginService.findByUsername(user);
        if (BzsyUtils.isEmpty(xyzUser)){
            return JsonReturn.fail(CommonStatus.USER_LOGIN_ACCOUNT_FAULT);
        }
        if (!xyzUser.getPassword().equals(Md5Utils.encryptPassword(user.getPassword(),SALT))){
            return JsonReturn.fail(CommonStatus.USER_LOGIN_ACCOUNT_FAULT);
        }
        session.setAttribute("user",xyzUser);
        return JsonReturn.success();
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "login";
    }

    @Value("${SALT}")
    private String SALT;

    @Autowired
    private LoginService loginService;

}
