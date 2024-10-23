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
  public boolean ajoutVoiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire != null) {
            return false; // La voiture a déjà un propriétaire
        }
        if (nbvoiture >= 3) {
            return false; // Le tableau est plein
        }
        Lstvoiture[nbvoiture] = voiture_a_ajouter;
        nbvoiture++;
        voiture_a_ajouter.Proprietaire = this;
        return true;
    }
    public String getListeVoitures() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nbvoiture; i++) {
            sb.append(Lstvoiture[i]).append(", ");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "";
    }
  
}



