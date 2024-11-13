/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author danie
 */
public class Magicien extends Personnage  {
     boolean confirme;

    // Constructeur
    public Magicien(String name, int health, boolean confirme) {
        super(name,health); 
        this.confirme = confirme;
    }

    // Setter pour la propriété confirme
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Confirmé: " + (confirme ? "Oui" : "Non");
    }
}


