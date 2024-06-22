package edu.jxyy.Service.Impl;

import edu.jxyy.Mapper.UserMapper;
import edu.jxyy.Service.UserService;
import edu.jxyy.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.login(username, password);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
