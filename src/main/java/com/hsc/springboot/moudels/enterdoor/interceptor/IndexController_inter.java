package com.hsc.springboot.moudels.enterdoor.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController_inter {

    @RequestMapping("/inter")
    public String index(Model model){
        model.addAttribute("content","hi , dalaoyang !");
        return "index";
    }
}