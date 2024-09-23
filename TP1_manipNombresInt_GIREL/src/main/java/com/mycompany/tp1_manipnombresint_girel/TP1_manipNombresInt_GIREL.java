/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_manipnombresint_girel;
import java.util.Scanner;

/**
 *@Role du programe ?
 * @Date 22/09/2024.
 * @author GIREL Antoine
 * @Groupe  TDC
 */
public class TP1_manipNombresInt_GIREL {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nombre1;
        System.out.println("entrez un nombre");
        nombre1= sc.nextInt();
        int nombre2;
        System.out.println("entrez un nombre");
        nombre2=sc.nextInt();
        int Somme;
        Somme=nombre1+nombre2;
        int Produit;
        Produit=nombre1*nombre2;
        int difference;
        difference=nombre1-nombre2;
        int reste;
        int Quotient;
        reste=nombre1%nombre2;
        Quotient=nombre1/nombre2;
        System.out.println("la somme des nombres est "+Somme+"");
        System.out.println("le produit des nombres est "+Produit+"");
        System.out.println("la difference des nombres  est "+difference+"");
        System.out.println("le reste de la divison des nombres  est "+reste+" et le quotient du nombre1 par le nombre2 est "+Quotient+"");
    }
}
