package com.pigschool.xyzshow.config;

import com.pigschool.xyzshow.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {

    private List<String> FilterPath = new ArrayList<>();

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        FilterPath.add("/user/**");
        FilterPath.add("/");
        FilterPath.add("");
        FilterPath.add("/index");
        FilterPath.add("/item/**");
        FilterPath.add("/publish/**");
        FilterPath.add("/search/**");
        FilterPath.add("/sm/**");
        // addPathPatterns("/**") 表示拦截所有的请求，
        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
        registry.addInterceptor(loginInterceptor).addPathPatterns(FilterPath);
        super.addInterceptors(registry);
    }

    // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/","file:D:/xyz/picture/");
    }


}
