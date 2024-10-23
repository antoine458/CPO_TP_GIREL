/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_girel;

/**
 *
 * @author danie
 */
public class Personne {
    int nbPersonne;
     int nbvoiture;
    String nom;
    String prenom;
    Voiture[] Lstvoiture;
   public Personne(String prenom,String nom){
        this.prenom=prenom;
        this.nom=nom;
        this.Lstvoiture= new Voiture[3];
        this.nbvoiture=0;
        
        
   }   
    public void Personne(int nb){
        this.nbPersonne=nb;
    }
    public int getnbPersonne(){
        return nbPersonne;
    }
 @Override 
public String toString () { 
return "nom : "+ nom +" : prenom : "+prenom+" ";
}  

}

