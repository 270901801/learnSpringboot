package com.hsc.springboot;

import com.hsc.springboot.moudels.enterdoor.interceptor.CommonInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableScheduling
public class HscSpringbootApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(HscSpringbootApplication.class, args);
    }

    //增加拦截器
//    @Autowired
//    CommonInterceptor commonInterceptor;
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(commonInterceptor);
//    }
}
