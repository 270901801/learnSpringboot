package com.hsc.springboot.moudels.enterdoor.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * springboot整合定时任务其实就两点，
 * 1.创建一个能被定时任务类，方法上加入@Scheduled注解
 * 2.在启动类application上加入@EnableScheduling注解
 */

@Component
public class TestTimer {
    //美妙调度任务
    @Scheduled(cron = "0/1 * * * * ?")//0 0 * * * ?
    private void test() {
//        System.out.println("执行定时任务的时间是："+new Date());
    }

}