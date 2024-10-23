/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_heroic_fantasy_girel;
import Armes.Epee;
import Armes.Arme;
import Armes.Baton;
import java.util.ArrayList;
/**
 *
 * @author danie
 */
public class TP3_Heroic_Fantasy_GIREL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Epee Riviere_Sanglante= new Epee ("Riviere Sanglante",99,60);
        Epee Faux_Mortuaire = new Epee("Faux_Mortuaire",80,60);
        Baton Lame_deleonora= new Baton("Lame_deleonora",85,10);
        Baton lame_blasphématoire= new Baton("lame_blasphématoire",60,22);
        ArrayList<Arme> BST = new ArrayList<>();
        BST.add(Lame_deleonora);
        BST.add(Faux_Mortuaire);
        BST.add(lame_blasphématoire);
        BST.add(Riviere_Sanglante);
        for (int i=0;i<BST.size();i++){
            System.out.println(BST.get(i));
        }
}
}