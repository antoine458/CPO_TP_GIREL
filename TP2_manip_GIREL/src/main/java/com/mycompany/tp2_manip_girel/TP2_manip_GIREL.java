/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_manip_girel;

/**
 *
 * @author danie
 */
public class TP2_manip_GIREL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        System.out.println("nb de calories de Assiette 2 : " + 
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " + 
assiette3.nbCalories) ;

 Tartiflette temp = assiette1; 
        assiette1 = assiette2;       
        assiette2 = temp;
        
        Moussaka[] moussakas = new Moussaka[10];

        
        for (int i = 0; i < moussakas.length; i++) {
            
            moussakas[i] = new Moussaka(300 + i * 50); 
             
        }
        for (Moussaka moussaka : moussakas) {
            System.out.println("Calories:" +moussaka.getNbCalories());
    }}
}

    
     

    

        //Moussaka assiette666 = assiette1; est incorrecte nous voulons affeceter une réference à un objet de type Tartiflette à une variable de type Moussaka.
        // Moussaka assiette667 = new Tartiflette(); est également incorrecte pour la même raison. Nous voulons créer un objet de type Tartiflette et de l'affecter à une variable de type Moussaka.
        // Donc non, une référence objet ne peut pas référencer un autre type d'objet qui n'a aucun rapport.