/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_girel;

/**
 *
 * @author danie
 */
public class Voiture {
    int nbvoiture;
    String modele;
    String marque;
    int puissance;
    public Voiture(String modele,String marque,int puissance){
        this.modele=modele;
        this.marque=marque;
        this.puissance=puissance;
        
    }
    public void voiture(int nb){
        this.nbvoiture=nb;
    }
    public int getnbvoiture(){
        return nbvoiture;
    }
 @Override 
public String toString () { 
return "modele : "+ modele +" : marque : "+marque+" : puissance : "+puissance+"Cv" ; 
}  
    }

