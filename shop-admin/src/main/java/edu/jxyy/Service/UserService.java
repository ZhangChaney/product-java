package edu.jxyy.Service;

import edu.jxyy.model.User;

import java.util.List;

public interface UserService {
    User login(String username, String password);

    List<User> getAllUser();
}
