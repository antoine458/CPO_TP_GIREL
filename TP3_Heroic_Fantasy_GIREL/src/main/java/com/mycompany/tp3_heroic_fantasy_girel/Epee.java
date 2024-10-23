/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_girel;

/**
 *
 * @author danie
 */
public class Epee extends Arme {
     int finesse;

    
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        if (finesse > 100 || finesse < 0) {
            throw new IllegalArgumentException("La finesse doit être entre 0 et 100.");
        }
        this.finesse = finesse;
    }

    
    public int getFinesse() {
        return finesse;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }
}