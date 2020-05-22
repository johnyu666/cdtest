package cn.johnyu.cdtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "/users")
    public String findAllUsers(){
        return "all users...123";
    }
}
