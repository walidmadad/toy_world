package Controleur;
import DAO.Singleton;
import Modele.Produit;
import Modele.Categorie;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class CategorieDAO {
    public void ajouterCategorie(Categorie prmCat) {
        Singleton conn = new Singleton();
        Connection connection = conn.getConnection();
        
        try {
            String query = "INSERT INTO categories(libelle, code) VALUES(?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, prmCat.getLibelle());
            ps.setInt(2, prmCat.getCode());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<String> AfficherCategorie(){
        Singleton conn = new Singleton();
        Connection connection = conn.getConnection();
        List<String> list = new ArrayList<String>();
        try{
            String sql = "SELECT libelle FROM categories";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Ajout des libellés au JComboBox
            while (resultSet.next()) {
                String libelle = resultSet.getString("libelle");
                list.add(libelle);
            }

            // Fermeture des ressources
            resultSet.close();
            statement.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
