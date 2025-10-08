package Decorator;

import Decorator.CLI.UserController;
import Decorator.Component.UserService;
import Decorator.ConcreteComponent.UserServiceImpl;
import Decorator.DB.Entities.User;
import Decorator.DB.InMemoryDB.UserDatabase;
import Decorator.Decorator.LoggerUserServiceImpl;

import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        UserDatabase userDatabase = new UserDatabase();
        UserService userService = new UserServiceImpl(userDatabase);
        UserService loggerService = new LoggerUserServiceImpl(userService);
        UserController userController = new UserController(loggerService);

        User user = new User(1L, "aldik", "aldik@example.com", "pass");

        userController.save(user);

        User entity = userController.findUserById(1L);

        List<User> users = userController.findAll();

        userController.deleteUserById(1L);

    }
}
