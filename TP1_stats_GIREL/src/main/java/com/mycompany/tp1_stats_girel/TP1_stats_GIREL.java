/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_stats_girel;

import java.util.Random;
import java.util.Scanner;

/**
 *@Role du programe ?
 * @Date 27/09/2024
 * @author GIREL Antoine 
 * @Groupe  TDC
 */
public class TP1_stats_GIREL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] Tab = new int[6];
        for(int i = 0; i!=6 ;i++){
            Tab[i]=0;
            System.out.println(Tab[i]);
        }
    Random generateurAleat = new Random();
    Scanner sc = new Scanner(System.in);
    int m;
    System.out.println(" entrez un nombre"); 
     m = sc.nextInt();
     
      while (m < 0 & m > 6);{ 

        System.out.println("veuillez choisir une valeur");
         m = sc.nextInt();
    }
         
     for (int j=0; j!=m;j++){
         Tab[j]= generateurAleat.nextInt(5);
         System.out.println(Tab[j]);
     }
    
    
    
    }
    }

