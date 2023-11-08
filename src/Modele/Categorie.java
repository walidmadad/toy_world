/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author walid
 */
public class Categorie {
    private String libelle;
    private int code ;
    public Categorie(String prmLibelle, int prmCode){
        libelle = prmLibelle;
        code = prmCode;
    }
    public String getLibelle(){
        return libelle;
    }
    public int getCode(){
        return code;
    }
}
