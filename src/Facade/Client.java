package Facade;

import Facade.context.repository.Entities.User;
import Facade.context.repository.InMemoryDB.UserDatabase;
import Facade.context.service.JwtService;
import Facade.context.service.impl.JwtServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserDatabase database = new UserDatabase();
        JwtService service = new JwtServiceImpl();
        LoginFacade loginFacade = new LoginFacade(database, service);

        User user = new User(1L, "aldik", "aldik@qsheker.com", "1234");
        database.addUser(user);

        System.out.println(loginFacade.login("aldik","1231"));
    }
}
