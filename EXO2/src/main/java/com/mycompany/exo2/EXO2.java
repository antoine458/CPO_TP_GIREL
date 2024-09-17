/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exo2;
import java.util.Scanner;
/**
 *@Role du programe sommme 
 * @Date 17/09/2024
 * @author GIREL Antoine
 * @Groupe  TDC
 */
public class EXO2 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Declaration des variables
        int nb; // nombre dentiers a additionner
        int result; // resultat
        int ind; //indice
        //nb=5;
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Entrer le nombre :");
            nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        result=0;
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
        result=result+ind;
        ind += 1;
        }
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
    }

}
 
