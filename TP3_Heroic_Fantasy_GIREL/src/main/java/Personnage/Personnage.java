/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;
import java.util.ArrayList;
import Armes.Arme;

/**
 *
 * @author danie
 */
public abstract class Personnage {
    String name;
    int health;
    private ArrayList<Arme> armes;
    
    private String armeEnMain; 
    public Personnage(String name,int health){
        this.health=health;
        this.name=name;
        this.armes = new ArrayList<>();  // Initialise l'inventaire d'armes
        this.armeEnMain = null;          // Initialise l'arme en main à null
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
     
    

    // Méthode pour ajouter une arme
    public void ajouterArme(Arme arme) {
        if (armes.size() < 5) {
            armes.add(arme);
            System.out.println("Arme '" + arme + "' ajoutée à l'inventaire.");
        } else {
            System.out.println("Impossible d'ajouter l'arme : inventaire plein (5 armes maximum).");
        }
    }

    // Getter pour obtenir l'arme en main
    public String getArmeEnMain(Arme armeEnain) {
        return armeEnMain;
    }

    // Méthode pour équiper une arme
    public void equiperArme(Arme nomArme) {
        if (armes.contains(nomArme)) {
            this.armeEnMain = nomArme;
            System.out.println("Le personnage est maintenant équipé de l'arme '" + nomArme + "'.");
        } else {
            System.out.println("L'arme '" + nomArme + "' n'a pas été trouvée dans l'inventaire.");
        }
    }

    
   
    public String Afficher (){
        String inventaire = armes.isEmpty() ? "Aucune arme" : String.join(", ", armes);
        String armeEnMainDescription = (armeEnMain != null) ? armeEnMain : "Aucune";
        return "Inventaire d'armes : " + inventaire + "\nArme en main : " + armeEnMainDescription;
    }

    
}


