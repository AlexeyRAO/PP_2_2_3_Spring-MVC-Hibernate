package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(Long id);

    void removeUserById(Long id);

    void updateUser(User updateUser);
}
