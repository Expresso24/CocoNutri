package model;

public class User {
    
    //attributes
    private int id;
    private String name;
    private char[] password;
    
    //default constructor
    public User(){}
    
    public User(int id,String name, char[] password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
    
    public User(String name, char[] password){
        this.name = name;
        this.password = password;
    }
    
    //getters and setters
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public char[] getPassword(){
        return password;
    }
    
    public void setPassword(char[] password){
        this.password = password;
    }
    
}
