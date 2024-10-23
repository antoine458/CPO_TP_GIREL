/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_relation_1_girel;

/**
 *
 * @author danie
 */
public class TP2_relation_1_GIREL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Voiture uneClio = new Voiture ("Clio williams", "Renault", 150 ) ; 
        Voiture uneAutreClio = new Voiture ("Clio Maxi kit car", "Renault", 250 ) ; 
        Voiture une2008 = new Voiture ("Escort MkII", "Ford", 283 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
        Personne bob = new Personne("Bobby", "Sixkiller"); 
        Personne reno = new Personne("Reno", "Raines"); 
//System.out.println("liste des voitures disponibles "+ uneClio  + 
//"\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra ) ;
    bob.Lstvoiture[0] = uneClio ; 
    bob.nbvoiture = 1 ; 
    uneClio.Proprietaire = bob ;
    reno.Lstvoiture[1] = une2008 ; 
    reno.nbvoiture = 1 ; 
    une2008.Proprietaire = bob ;
    bob.Lstvoiture[2] = uneAutreClio ; 
    bob.nbvoiture = 2 ; 
    uneAutreClio.Proprietaire = bob ;
    System.out.println("la premiere voiture de Bob est " + 
bob.Lstvoiture[0] ) ; 
    System.out.println("la premiere voiture de reno est " + 
reno.Lstvoiture[1] );
            System.out.println("la deuxieme voiture de Bob est " + 
bob.Lstvoiture[2] );
    }
}
