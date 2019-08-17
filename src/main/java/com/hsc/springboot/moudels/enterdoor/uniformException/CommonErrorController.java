package com.hsc.springboot.moudels.enterdoor.uniformException;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hsc
 * @date 2019/8/16 - 11:06
 */
@RestController
public class CommonErrorController implements ErrorController {
    private final String ERROR_PATH="/error";
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
    @RequestMapping(value=ERROR_PATH)
    public String handleError(){
        System.out.println(getErrorPath());
        return "error";
    }
}
