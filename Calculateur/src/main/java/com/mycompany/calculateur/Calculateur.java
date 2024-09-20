/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculateur;
import java.util.Scanner;

/**
 *@Role du programe calculateur 
 * @Date 17/09/2024
 * @author GIREL Antoine
 * @Groupe  TDC
 */
public class Calculateur {
    public static void main(String[] args) {
    
        int operateur;
        float operande1;
        float operande2;
        float result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                            Rentrez une valeur selon l'operateur souhaite :
                           1) add
                           2) substract
                           3) multiply
                           4) divide
                           5) modulo""");
        operateur=sc.nextInt();
        
        while (operateur != 1 && operateur != 2 && operateur != 3 && operateur != 4 && operateur != 5) {
        System.out.println("choisir une valeur valable");
        operateur=sc.nextInt();
        } 
        System.out.println("Saisir une premiere valeur ");
        operande1=sc.nextFloat();
        System.out.println("Saisir une deuxieme valeur ");
        operande2=sc.nextFloat();
        
           switch (operateur) {
            case (1) :  result = operande1+operande2;
            break;
            case (2) :  result = operande1-operande2;
            break;
            case (3) :  result = operande1*operande2;
            break;
            case (4) :  result = operande1/operande2;
            break;
            case (5) :  result = operande1%operande2;
            default :   System.out.println("Selectionnez une valeur entre 1 et 5");
        }
        System.out.println("Le resultat est : " +result);
    }
} 

