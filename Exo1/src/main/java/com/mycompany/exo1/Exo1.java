/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exo1;
import java.util.Scanner;
/**
 *@Autor  GIREL  Antoine
 * @Groupe  TDC
 * @Role du programe ?
 * @Date 17/09/2024
 */
public class Exo1 {

    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("Aurevoir");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Votre prénom est " +prenom);
        System.out.println("Votre prenom est " +prenom);
    }
}
