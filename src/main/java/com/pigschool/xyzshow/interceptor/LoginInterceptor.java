package com.pigschool.xyzshow.interceptor;

import com.pigschool.xyzshow.model.XyzUser;
import com.pigschool.xyzshow.util.BzsyUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        XyzUser user = (XyzUser) request.getSession().getAttribute("user");
        if (BzsyUtils.isEmpty(user)){
            //登录拦截 并且跳转到登录页面
            PrintWriter out = response.getWriter();
            out.print("<script>window.top.location.href ='/login'</script>");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
