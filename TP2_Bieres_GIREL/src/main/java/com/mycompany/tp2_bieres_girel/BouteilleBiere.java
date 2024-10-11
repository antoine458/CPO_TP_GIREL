package com.mycompany.tp2_bieres_girel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class BouteilleBiere {
    String name;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() {
System.out.println("Bouteille de " + name +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
    }
    
public BouteilleBiere(String unNom, double unDegre, String 
uneBrasserie,boolean ouverte) {
 name = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
 

}
 public void decapsuler(boolean ouverte){
     if (ouverte==false){
         ouverte=true;
     } 
     else{ System.out.println("La bouteille a deja etait siphonnée" ) ;
     }
 }
 @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = name + " (" + degreAlcool + " degrés) Ouverte ? "; 
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}



}

