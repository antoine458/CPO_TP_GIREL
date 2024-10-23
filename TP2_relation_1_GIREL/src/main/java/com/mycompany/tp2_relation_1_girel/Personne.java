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
    public void Personne(int nb){
        this.nbPersonne=nb;
    }
    public int getnbPersonne(){
        return nbPersonne;
    }
 @Override 
public String toString () { 
return "nb de conversions"+ nbPersonne; 
}  
    }


