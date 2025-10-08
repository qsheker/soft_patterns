package Decorator.Component;

import Decorator.DB.Entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findUserById(Long id);

    void save(User user);

    void deleteUserById(Long id);
}
