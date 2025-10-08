package Decorator.Decorator;

import Decorator.Component.UserService;
import Decorator.ConcreteComponent.UserServiceImpl;
import Decorator.DB.Entities.User;

import java.util.List;

public class LoggerUserServiceImpl implements UserService {
    private UserService wrappedService;
    public LoggerUserServiceImpl(UserService userService){
        this.wrappedService = userService;

    }

    @Override
    public List<User> findAll() {
        long start = System.currentTimeMillis();
        System.out.println("Finding all users...");
        List<User> users = wrappedService.findAll();
        long end = System.nanoTime();
        System.out.println("Finished!");
        long result = System.currentTimeMillis()-start;
        System.out.println("Result: "+result+"ms");
        return users;
    }

    @Override
    public User findUserById(Long id) {
        long start = System.currentTimeMillis();
        System.out.println("Finding User with id: "+id+ " ...");
        User user = wrappedService.findUserById(id);
        System.out.println("Finished!");
        long result = System.currentTimeMillis()-start;
        System.out.println("Result: "+result+"ms");
        return user;
    }

    @Override
    public void save(User user) {
        long start = System.currentTimeMillis();
        System.out.println("Saving the user...");
        wrappedService.save(user);
        System.out.println("Finished!");
        long result = System.currentTimeMillis()-start;
        System.out.println("Result: "+result+"ms");
    }

    @Override
    public void deleteUserById(Long id) {
        long start = System.currentTimeMillis();
        System.out.println("Deleting the user with id: "+id+" ...");
        wrappedService.deleteUserById(id);
        System.out.println("Finished!");
        long result = System.currentTimeMillis()-start;
        System.out.println("Result: "+result+"ms");
    }
}
