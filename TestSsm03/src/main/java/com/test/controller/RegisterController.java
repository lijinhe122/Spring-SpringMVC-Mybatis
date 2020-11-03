package com.test.controller;
import com.test.chang.RuleStatus;
import com.test.chang.RuleStatus2;
import com.test.pojo.Register;
import com.test.pojo.User;
import com.test.service.impl.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LXZ
 * @since 2020-10-31
 */
@RestController
@RequestMapping("/testssm")
public class RegisterController {

    @Autowired
    private RegisterServiceImpl respl;

  @RequestMapping(value = "/register",produces = "text/html; charset=utf-8")
    public String register(@RequestParam String username, @RequestParam String password){


        System.out.println("11111111111111");
        Register register = respl.register( username,password);
        RuleStatus2 ruleStatus2 = new RuleStatus2();
        if (register!=null)
        {
            System.out.println("222222222222");
           return  RuleStatus.succ().toString();

        }else
        {
            return RuleStatus.fail().toString();
        }

    }
//成功
@RequestMapping("/user")
    public String user(){
      User user = new User("zs","1234");
      return user.toString();
}
//    ResponseBody和RequestBody
//    @ResponseBody把后台pojo转换成json对象
//
//    @RequestBody接收前台json数据,把json数据封装成对象

//    @RequestBody:1.直接传json
//                 2.对象
    @RequestMapping(value = "/user2",produces ="application/json;charset=utf-8")
    public String user(@RequestBody User user){
//        User user = new User("zs","1234");
        System.out.println(user.getPassword()+" "+user.getUsername());
        return "aaaa";
    }

}

