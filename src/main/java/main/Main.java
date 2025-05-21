package main;

import view.CreateUserView;
import controller.CreateUserController;
import dao.DatabaseConnection;
import dao.UserDAO;
import java.sql.Connection;


public class Main {

    public static void main(String[] args) {
        //create the database connection
        Connection connection = DatabaseConnection.getConnection();
        
        UserDAO userDAO = new UserDAO(connection);
        
        CreateUserController userController = new CreateUserController(userDAO);
        
        //create the view
        CreateUserView userView = new CreateUserView(userController);
        userView.setVisible(true);
        
    }
}
