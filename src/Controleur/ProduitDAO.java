/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import DAO.Singleton;
import DAO.Singleton;
import Modele.Produit;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author walid
 */
public class ProduitDAO {
    public void ajouterProduit(Produit prmPrd){
        Singleton conn = new Singleton();
        Connection connection = conn.getConnection();
        
        try {
            String query = "INSERT INTO produits(reference, designation, prix_public, prix_achat, quantite_en_stock, libelle) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, prmPrd.getRef());
            ps.setString(2, prmPrd.getDesi());
            ps.setDouble(3, prmPrd.getPrixPublic());
            ps.setDouble(4, prmPrd.getPrixAchat());
            ps.setInt(5, prmPrd.getQuantite());
            ps.setString(6, prmPrd.getLibelle());
            ps.executeUpdate();
            ps.close();
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}
