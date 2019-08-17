package com.hsc.springboot.moudels.database.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Mybatis_UserController {

    @Autowired
    UserMapper userMapper;



    //http://localhost:8888/getUser?username=xiaoli2
    @RequestMapping("/getUser")
    public String getUser(String username){
        User_mybatis user =userMapper.findUserByUsername(username);
        return user!=null ? username+"的密码是："+user.getUser_password():"不存在用户名为"+username+"的用户";
    }

    //http://localhost:8888/updateUser?username=xiaoli2&password=123
    @RequestMapping("/updateUser")
    public String updateUser(String password,String username){
        User_mybatis user = new User_mybatis(username,password);
        userMapper.updateUserByUsername(user);
        return "success!";
    }


    //http://localhost:8080/addUser?username=xiaoli2&password=123
    @GetMapping("/addUser")
    public String addUser(String username,String password){
//        return "adduser";
        User_mybatis user = new User_mybatis(username,password);
        userMapper.saveUser(user);
        return "success!";
    }

    //http://localhost:8888/deleteUser?username=xiaoli2
    @RequestMapping("/deleteUser")
    public String deleteUser(String username){
        userMapper.deleteUserByUsername(username);
        return "success!";
    }

    //http://localhost:8888/getUserList
    @RequestMapping("/getUserList")
    public List getUserList(String username, String password){
        return userMapper.getUserList();
    }
}