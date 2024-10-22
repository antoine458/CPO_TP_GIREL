/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_girel;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class TP2_convertisseurObjet_GIREL {

     public static void main(String[] args) {
        Convertisseur convertisseur = new Convertisseur();
        Scanner Selection = new Scanner(System.in);
        boolean continuer = true;
        while (continuer) {
            System.out.println("Menu :");
            System.out.println("1. Convertir Celsius en Fahrenheit");
            System.out.println("2. Convertir Fahrenheit en Kelvin");
            System.out.println("3. Convertir Kelvin Vers Celsius");
            System.out.println("4. Convertir Celsius Vers Kelvin");
            System.out.println("5. Convertir Kelvin Vers Farenheitt");
            System.out.println("6. Convertir Farenheit Vers Kelvin");            
            System.out.println("7. Afficher le nombre de conversions");
            System.out.println("8. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = Selection.nextInt();
            float valeur;

            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en Celsius : ");
                    valeur = Selection.nextFloat();
                    System.out.println("Résultat : " + convertisseur.CelsiusVersFarenheit(valeur));
                    break;
                case 2:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    valeur = Selection.nextFloat();
                    System.out.println("Résultat : " + convertisseur.FarenheitVersKelvin(valeur));
                    break;
                case 3:
                    System.out.print("Entrez la température en Kelvin : ");
                    valeur = Selection.nextFloat();
                    System.out.println("Résultat : " + convertisseur.KelvinVersCelsius(valeur));
                    break;
                case 4:
                    System.out.print("Entrez la température en Celsius : ");
                    valeur = Selection.nextFloat();
                    System.out.println("Résultat : " + convertisseur.CelsiusVersKelvin(valeur));
                    break;
                case 5:
                    System.out.print("Entrez la température en Kelvin : ");
                    valeur = Selection.nextFloat();
                    System.out.println("Résultat : " + convertisseur.KelvinVersFarenheit(valeur));
                    break;
                case 6:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    valeur = Selection.nextFloat();
                    System.out.println("Résultat : " + convertisseur.FarenheitVersKelvin(valeur));
                    break;
                case 7:
                    System.out.println(convertisseur);
                    break;
                case 8:
                    continuer = false;
                    break;
                default:
                    System.out.println("Option non valide. Réessayez.");
            }
        }

        Selection.close();
    }
}