package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    
    private static final String URL = "jdbc:mariadb://localhost:3306/coco";
    private static final String USER = "";
    private static final String PASSWORD = "";
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e){
            System.out.println("Error al conectar la db" + e.getMessage());
            return null;
        }
        
    }
}
