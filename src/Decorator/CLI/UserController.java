package Decorator.CLI;

import Decorator.Component.UserService;
import Decorator.DB.Entities.User;

import java.util.List;

public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    public List<User> findAll(){
        return userService.findAll();
    }
    public User findUserById(Long id){
        return userService.findUserById(id);
    }
    public void deleteUserById(Long id){
        userService.deleteUserById(id);
    }
    public void save(User user){
        userService.save(user);
    }
}
