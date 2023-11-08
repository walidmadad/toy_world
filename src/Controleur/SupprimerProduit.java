/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import DAO.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author walid
 */
public class SupprimerProduit {
    public SupprimerProduit(String ref){
        
        Singleton conn = new Singleton();
        Connection connection = conn.getConnection();
        
        try{
            String query = "DELETE FROM produits WHERE `produits`.`reference` = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, ref);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    
    }
}
