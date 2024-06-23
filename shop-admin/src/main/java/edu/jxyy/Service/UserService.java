package edu.jxyy.Service;

import edu.jxyy.model.User;

import java.util.List;

public interface UserService {
    User login(String username, String password);

    List<User> getAllUser();

    void deleteUser(int id);

    void addUser(User user);

    void updateUser(User user);

    User getUserById(int id);
}
