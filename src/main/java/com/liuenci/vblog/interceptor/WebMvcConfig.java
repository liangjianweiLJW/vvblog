package com.liuenci.vblog.interceptor;


import com.liuenci.vblog.utils.CommonUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

/**
 * 向mvc中添加自定义组件
 *
 * @author liuenci
 */
@Component
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Resource
    private BaseInterceptor baseInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(baseInterceptor);
    }

    /**
     * 添加静态资源文件，外部可以直接访问地址
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:"+ CommonUtils.getUplodFilePath()+"upload/");
        super.addResourceHandlers(registry);
    }
}
