package com.hsc.springboot.moudels.middleware.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hsc
 * @date 2019/8/17 - 14:00
 */
@RestController
public class RabbitMqController {
    @Autowired
    private Sender sender;

    @GetMapping("rabbitmq")
    public String helloTest(){
        System.out.println("正在发送！");
        sender.send();
        System.out.println("发送成功！");
        return "success";
    }
}
