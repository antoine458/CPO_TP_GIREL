/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author danie
 */

    public class Baton extends Arme {
     int age;

    
    public Baton(String name, int level, int finesse) {
        super(name, level);
        if (finesse > 100 || finesse < 0) {
            throw new IllegalArgumentException("L'age doit être entre 0 et 100.");
        }
        this.age = finesse;
    }

    
    public int getFinesse() {
        return age;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Age : " + age;
    }
}

