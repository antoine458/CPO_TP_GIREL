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
    public void voiture(int nb){
        this.nbvoiture=nb;
    }
    public int getnbvoiture(){
        return nbvoiture;
    }
 @Override 
public String toString () { 
return "nb de conversions"+ nbvoiture; 
}  
    }

