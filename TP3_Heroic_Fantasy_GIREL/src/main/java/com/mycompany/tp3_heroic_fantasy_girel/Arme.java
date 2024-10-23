/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_girel;

/**
 *
 * @author danie
 */
public class Arme {
    String name;
    int level;
    public Arme(String name,int level){
        this.name=name;
        this.level=0;
    } 
       public void Arme(int nb){
        this.level=nb;
    
}
        public String getinfos(){
        return  "name : "+ name +" : level : "+ level ;
    }
}
