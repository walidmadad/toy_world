/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author walid
 */
public class Produit {
    private String ref;
    private String designation;
    private double prix_public;
    private double prix_achat;
    private int quantite_en_stock;
    private String libelle;
    public Produit(String prmRef, String prmDesi, double prmPrixPublic, double prmPrixAchat, int prmQuantite, String prmLibelle){
        this.ref = prmRef;
        this.designation = prmDesi;
        this.prix_achat = prmPrixAchat;
        this.prix_public = prmPrixPublic;
        this.quantite_en_stock = prmQuantite;
        this.libelle = prmLibelle;
    }
    public String getRef(){
        return ref;
    }
    public String getDesi(){
        return designation;
    }
    public String getLibelle(){
        return libelle;
    }
    public double getPrixPublic(){
        return prix_public;
    }
    public double getPrixAchat(){
        return prix_achat;
    }
    public int getQuantite(){
        return quantite_en_stock;
    }
}
