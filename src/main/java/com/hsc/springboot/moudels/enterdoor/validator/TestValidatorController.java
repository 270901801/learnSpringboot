package com.hsc.springboot.moudels.enterdoor.validator;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**不止有前台验证
 * 后台也要做验证
 *
 * 1.编写一个User类，在他的成员变量上添加
 * ·    @NotEmpty(message="用户名不能为空")
 *     @Length(min=6,max = 12,message="用户名长度必须位于6到12之间")
 *     @Email(message="请输入正确的邮箱")
 *     @Pattern(regexp = "^(\\d{18,18}|\\d{15,15}|(\\d{17,17}[x|X]))$", message = "身份证格式错误")
 *     等注解
 * 2.在请求方法的参数里，添加@Valid注解，与前面的User绑定,添加一个参数BindingResult，返回错误集合
 */
@RestController
public class TestValidatorController {

    @PostMapping("/user")
    public String testUser(@Valid User User, BindingResult bindingResult){
        StringBuffer stringBuffer = new StringBuffer();
        if(bindingResult.hasErrors()){
            List<ObjectError> list =bindingResult.getAllErrors();
            for (ObjectError objectError:list) {
                stringBuffer.append(objectError.getDefaultMessage());
                stringBuffer.append("---");
            }
        }
        return stringBuffer!=null?stringBuffer.toString():"";
    }
}