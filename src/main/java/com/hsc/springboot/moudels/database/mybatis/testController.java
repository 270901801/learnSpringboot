package com.hsc.springboot.moudels.database.mybatis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hsc
 * @date 2019/8/17 - 13:07
 */
@RestController
public class testController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
