/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_heroic_fantasy_girel;
import Personnage.Personnage;
import Personnage.Magicien;
import Personnage.Guerrier;
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
        Magicien Gandalf = new Magicien ("Gandalf",65,true );
        Magicien Garcimore = new Magicien ("Garcimore",42,false );
        Guerrier conan = new Guerrier("conan",78,false);
        Guerrier Lannister = new Guerrier("Lannister",45,true);
        ArrayList<Personnage> Armée = new ArrayList<>();
        Armée.add(conan);
        Armée.add(Gandalf);
        Armée.add(Garcimore);
        Armée.add(Lannister);
        for ( i=0;i<Armée.size();i++){
            System.out.println(Armée.get(i));
        }
        
        }
        
      
    
        Guerrier perso = new Guerrier("conan",78,false);
        
        
        perso.ajouterArme("Épée");
        perso.ajouterArme("Arc");
        perso.ajouterArme("Hache");
        perso.ajouterArme("Lance");
        perso.ajouterArme("Dague");
        perso.ajouterArme("Masse");  
        
        System.out.println(perso);  

      
        perso.equiperArme("Arc");  
        System.out.println(perso);  


        perso.equiperArme("Fouet");  
    }
}
           