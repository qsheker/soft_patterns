package Decorator.DB.InMemoryDB;

import Decorator.DB.Entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDatabase {
    private List<User> users;

    public UserDatabase(){
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User u){
        users.add(u);
    }
    public Optional<User> findUserById(Long id){
        for(User u: users){
            if(u.getId()==id){
                return Optional.of(u);
            }
        }
        return null;
    }
    public void deleteUserById(Long id){
        for(int i=0; i<users.size();i++){
            if(users.get(i).getId()==id){
                users.remove(i);
                return;
            }
        }
    }

}
