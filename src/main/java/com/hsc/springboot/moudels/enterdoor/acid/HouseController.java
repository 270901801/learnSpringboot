package com.hsc.springboot.moudels.enterdoor.acid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {

//    @Autowired
//    private HouseRepository houseRepository;
//
//    @GetMapping("/test1")
//    public String test1(){
//        houseRepository.save(new House("house1", "100平方米"));
//        houseRepository.save(new House("house2", "100平方米"));
//        houseRepository.save(new House("house3", "100平方米"));
//        houseRepository.save(new House("house444444444", "100平方米"));
//        houseRepository.save(new House("house5", "100平方米"));
//        return "success";
//    }
//
//    @GetMapping("/test2")
//    @Transactional
//    public String test2(){
//        houseRepository.save(new House("house6", "100平方米"));
//        houseRepository.save(new House("house7", "100平方米"));
//        houseRepository.save(new House("house8", "100平方米"));
//        houseRepository.save(new House("house999999999", "100平方米"));
//        houseRepository.save(new House("house10", "100平方米"));
//        return "success";
//    }
}