package Decorator.ConcreteComponent;

import Decorator.Component.UserService;
import Decorator.DB.Entities.User;
import Decorator.DB.InMemoryDB.UserDatabase;

import java.util.List;


public class UserServiceImpl implements UserService {
    private UserDatabase db;

    public UserServiceImpl(UserDatabase db){
        this.db = db;
    }

    @Override
    public List<User> findAll() {
        return db.getUsers();
    }

    @Override
    public User findUserById(Long id) {
        return db.findUserById(id).orElseThrow(
                ()-> new RuntimeException("User not found!")
        );
    }

    @Override
    public void save(User u) {
        db.addUser(u);
    }

    @Override
    public void deleteUserById(Long id) {
        db.deleteUserById(id);
    }
}
