/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
/**
 *
 * @author walid
 */
public class Singleton {
    public static Connection connection;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/toy_world?serverTimezone=UTC", "root", "");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
