package dao;

import java.util.List;
import java.util.ArrayList;

import model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAO {
    
    private final Connection connection;
    
    public UserDAO(Connection connection){
        this.connection = connection;
    }
    
    
    public boolean insertUser(User user){
        String sql = "INSERT INTO users (name, password) VALUES (?, ?)";
        
        try( PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, user.getName());
            stmt.setString(2, new String(user.getPassword()));
            
            stmt.executeUpdate();
            return true;
            
        } catch(SQLException e){
            System.out.println("Error al insertar en la base de datos: " + e.getMessage());
            return false;
        }
    }
    
    public List<User> getAllUsers() {
    List<User> usuarios = new ArrayList<>();
    String sql = "SELECT id, name, password FROM users";

    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String password = rs.getString("password");

            User user = new User(id, name, password.toCharArray());
            usuarios.add(user);
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener usuarios: " + e.getMessage());
    }

    return usuarios;
}

}
