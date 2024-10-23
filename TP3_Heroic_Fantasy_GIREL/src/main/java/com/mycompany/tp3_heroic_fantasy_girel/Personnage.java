/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_girel;

/**
 *
 * @author danie
 */
public abstract class Personnage {
    String name;
    int health;
    public Personnage(String name,int health){
        this.health=health;
        this.name=name;
    }
        public String getname(){
            return name;
                   
        }
        public int gethealth(){
            return health;
            
        }
    @Override
        public String toString(){
    return "name : "+ name +" : vie : "+ health ;
    }
    
}
