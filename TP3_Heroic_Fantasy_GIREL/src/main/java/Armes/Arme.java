/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;
/**NiveauArmes
 *
 * 
 */
public abstract class Arme{
    String nom;
    int niveau;
    public Arme(String nom, int niveau){
        if (niveau>100){
           throw new IllegalArgumentException("Niveau de l'arme superieure à 100");
        }
        this.nom=nom;
        this.niveau=niveau;
    }
    public int NiveauArmes(){
        return niveau;
    }
    public String NomArmes(){
        return nom;
    }
        
    @Override
    public String toString(){
        return "L'arme s'apelle : "+nom+" et son niveau d'attaque est de : "+niveau;
    }
    
    
}
            
            
   