package edu.jxyy.controller;

import edu.jxyy.Service.UserService;
import edu.jxyy.model.Result;
import edu.jxyy.model.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User u){
        String username = u.getUsername();
        String password = u.getPassword();
        User user = userService.login(username, password);

        // 1. 用户不存在
        if (user == null){
            return Result.error("用户名或密码错误！");
        }
        // 2. 用户存在登录成功，密码要置空
        user.setPassword("");
        return Result.success(user);
    }

    @GetMapping("/getAllUser")
    public Result getAllUser(){
        // 调用service方法查询所有用户
        List<User> users = userService.getAllUser();

        // 将所有用户的数据返回给前端
        return Result.success(users);
    }

}
