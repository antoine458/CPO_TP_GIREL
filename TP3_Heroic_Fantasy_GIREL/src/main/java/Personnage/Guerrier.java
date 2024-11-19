/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author danie
 */
public class Guerrier extends Personnage{
     boolean cheval;

    // Constructeur
    public Guerrier(String name, int health, boolean confirme) {
        super(name,health); 
        this.cheval = confirme;
    }

  
    public void setConfirme(boolean confirme) {
        this.cheval = confirme;
    }

   
    @Override
    public String toString() {
        return super.toString() + ", Confirmé: " + (cheval ? "Oui" : "Non");
    }
}

