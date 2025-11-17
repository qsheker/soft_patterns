package Facade;

import Facade.context.repository.InMemoryDB.UserDatabase;
import Facade.context.service.JwtService;

public class LoginFacade {

    private final UserDatabase database;
    private final JwtService service;

    public LoginFacade(UserDatabase database, JwtService service) {
        this.database = database;
        this.service = service;
    }

    public String login(String username, String password){
        var user = database.findUserByUsername(username)
                .orElseThrow(
                        ()-> new RuntimeException("User not found!")
                );
        if(password.equals(user.getPassword())){
            return service.generateToken();
        }
        String error = "Error can not login. Check your username or password for correctness";
        return error;
    }
}
