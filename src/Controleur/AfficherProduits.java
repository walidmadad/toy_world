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
public class AfficherProduits {
    public List<String> AfficherPrds(){
        Singleton conn = new Singleton();
        Connection connection = conn.getConnection();
        List<String> list = new ArrayList<String>();
        try{
            String sql = "SELECT reference FROM produits";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
           
            while (resultSet.next()) {
                String ref = resultSet.getString("reference");
                list.add(ref);
            }

            resultSet.close();
            statement.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
