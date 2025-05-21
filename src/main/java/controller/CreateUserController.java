package controller;

import model.User;
import dao.UserDAO;


public class CreateUserController {
    
    private final UserDAO userDB;
    
    public CreateUserController(UserDAO userDB){
        this.userDB = userDB;
    }
    
    public boolean insertUserDB(String name, char[] password){
        User user1 = new User(name, password);
        boolean success = userDB.insertUser(user1);
        
        return success;
    }
}
