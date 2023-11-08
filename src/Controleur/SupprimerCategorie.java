/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import DAO.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author walid
 */
public class SupprimerCategorie {
    String cat;
    int code;
    public SupprimerCategorie(String prmCat){
        this.cat = prmCat;
    }
    public void recupCode(){
        Singleton conn = new Singleton();
        Connection connection = conn.getConnection();
        
        try{
            String query = "SELECT code FROM categories WHERE libelle = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, cat);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                code = resultSet.getInt("code");
            } else {
                System.out.println("Catégorie non trouvée.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void SuppCat(){
        recupCode();
        Singleton conn = new Singleton();
        Connection connection = conn.getConnection();
        
        try{
            String query = "DELETE FROM categories WHERE `categories`.`code` = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, code);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    
    }
}
