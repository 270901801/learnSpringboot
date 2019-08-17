package com.hsc.springboot.moudels.enterdoor.returnJsonOrXml;

import com.hsc.springboot.moudels.enterdoor.returnJsonOrXml.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**加入依赖
         * <dependency>
 *             <groupId>com.fasterxml.jackson.dataformat</groupId>
 *             <artifactId>jackson-dataformat-xml</artifactId>
 *         </dependency>
 *
 * 在请求的方法上添加
 * @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
 * @GetMapping(value = "/xml",produces = MediaType.APPLICATION_XML_VALUE)
 */
@RestController
public class UserController {

    //http://localhost:8080/json
    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public User index(){
        User user = new User("dalaoyang", "26", "北京");
        return user;
    }


    //http://localhost:8080/xml
    @GetMapping(value = "/xml",produces = MediaType.APPLICATION_XML_VALUE)
    public User XML(){
        User user = new User("dalaoyang", "26", "北京");
        return user;
    }
}