/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_girel;

/**
 *
 * @author danie
 */
public class TP2_convertisseurObjet_GIREL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Convertisseur C1 = new Convertisseur();
        Convertisseur C2 = new Convertisseur();
        
        double result1 = CelsiusVersKelvin(25); 
        double result2 = KelvinVersCelsius(77);  
        double result3 = Convertisseur.FarenheitVersCelsius(100);    
        
                }
}
