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
import javax.swing.DefaultListModel;

/**
 *
 * @author walid
 */
public class AfficherCategorie {
    public List<String> AfficherCategories(){
        Singleton conn = new Singleton();
        Connection connection = conn.getConnection();
        List<String> list = new ArrayList<String>();
        try{
            String sql = "SELECT libelle FROM categories";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
           
            while (resultSet.next()) {
                String libelle = resultSet.getString("libelle");
                list.add(libelle);
            }

            resultSet.close();
            statement.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public DefaultListModel<String> AfficherCategories2(){
        Singleton conn = new Singleton();
        Connection connection = conn.getConnection();
        DefaultListModel<String> list = new DefaultListModel<String>();
        try{
            String sql = "SELECT libelle FROM categories";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
           
            while (resultSet.next()) {
                String libelle = resultSet.getString("libelle");
                list.addElement(libelle);
            }

            resultSet.close();
            statement.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
