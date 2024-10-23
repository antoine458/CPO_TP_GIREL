/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author danie
 */
public abstract  class Arme {
    String name;
    int level;
    public Arme(String name,int level){
        this.name=name;
        this.level=level;
        if (level > 100 || level < 0) {
            throw new IllegalArgumentException("Le niveau d'attaque doit être entre 0 et 100.");
        }
    } 
       public void Arme(int nb){
        this.level=nb;
    
}
       
       @Override
        public String toString(){
        return  "name : "+ name +" : level : "+ level ;
    }
           public String getNom() {
        return name;
    }
            public int getNiveauAttaque() {
        return level;
            }}
            
            
            
   