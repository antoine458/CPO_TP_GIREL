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
    
    
    private Arme ArmeMain; 
    public Personnage(String name,int health){
        this.health=health;
        this.name=name;
        this.armes = new ArrayList<>();  // Initialise l'inventaire d'armes
        this.ArmeMain = null;          // Initialise l'arme en main à null
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

   
    
    
    public Arme getArmeEnMain(Arme armeEnain) {
        return ArmeMain;
    }

 public void equiperArme(String nomArme) {
        for (Arme arme : armes) {
            if (armes.contains(arme)) {
                ArmeMain = arme;
                System.out.println("Arme trouvee et equipee : " + ArmeMain);
                return;
            }
        
        System.out.println("Arme " + nomArme + " non trouvée dans l'inventaire.");
    }

        

  
  
  
  
   @Override
   public String toString() {
        String description = "Nom : " + Arme.getNom() + ", Niveau : " + ArmeMain.NiveauArmes();
        if (ArmeMain != null) {
            description += ", Arme en main : " + ArmeMain.getNom() + " (Puissance : " + ArmeMain.NiveauArmes() + ")";
        } else {
            description += ", Pas d'arme équipée.";
        }
        return description;
 }}}
   
    



