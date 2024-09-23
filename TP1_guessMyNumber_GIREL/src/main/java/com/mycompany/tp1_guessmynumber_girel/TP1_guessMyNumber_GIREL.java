/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_guessmynumber_girel;
import java.util.Scanner;
import java.util.Random;
/**
 *@Role du programe ?
 * @Date 22/09/2024
 * @author GIREL Antoine
 * @Groupe  TDC
 */
public class TP1_guessMyNumber_GIREL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Random generateurAleat = new Random();
        int n;
        n=generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
         System.out.println("Entrer un nombre : ");
         int ValeurJoueur;
      ValeurJoueur = sc.nextInt();
      while (n != ValeurJoueur) {
          if (n<ValeurJoueur) {
              System.out.println("Trop Grand");
              ValeurJoueur = sc.nextInt();} else { 
              System.out.println("Trop Petit");
              ValeurJoueur = sc.nextInt();}}
      System.out.println("Bravo, vous avez gagne, le nombre a deviner etait : "+n);
  }
}
    

