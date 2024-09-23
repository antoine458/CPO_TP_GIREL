/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_convertisseur_girel;
import java.util.Scanner;
/**
 *@Role du programe ?
 * @Date 22/09/2024
 * @author GIREL Antoine
 * @Groupe  TDC
 */
public class TP1_convertisseur_GIREL {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double Val;
        System.out.println("entrez un nombre");
        Val=sc.nextDouble();
        double ValK;
        ValK=Val+273.15;
        System.out.println("la valeur en kelvin est "+ValK+"");
        System.out.println("la valeur en kelvin est "+CelciusVersKelvin(Val)+"");
        System.out.println("Veuillez choisir une valeur");
        Val=sc.nextDouble();
        int conversion;
        System.out.println("""
                           Veuillez choisir une conversion: 
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) De Farenheit vers Celcius
                           4) De Celcius vers Farenheit
                           5) De Kelvin vers Farenheit
                           6) De Farenheit vers Kelvin""");
        conversion=sc.nextInt();
        switch (conversion){
            case (1)-> System.out.println("la temperature est "+CelciusVersKelvin(Val)+"");
            case (2)-> System.out.println("la temperature est "+KelvinVersCelcius(Val)+"");
            case (3)-> System.out.println("la temperature est "+FarenheitVersCelcius(Val)+"");
            case (4)-> System.out.println("la temperature est "+CelciusVersFarenheit(Val)+"");
            case (5)-> System.out.println("la temperature est "+KelvinVersFarenheit(Val)+"");
            case (6)-> System.out.println("la temperature est "+FarenheitVersKelvin(Val)+"");
            default -> System.out.println("la valeur doit appartenir a [1,6]");
        
        }
    }
    public static double CelciusVersKelvin(double Tcelsius){
     double kelvin;
     kelvin = Tcelsius + 273.15;
     return kelvin;
    }
    public static double KelvinVersCelcius(double Tkelvin){
     double kelvin;
     kelvin = Tkelvin - 273.15;
     return kelvin; 
    }
    public static double FarenheitVersCelcius(double Tfarenheit){
     double kelvin;
     kelvin = (Tfarenheit-32)*(5/9);
     return kelvin;
    }
    public static double CelciusVersFarenheit(double Tcelsius){
     double kelvin;
     kelvin = (Tcelsius*(9/5)) + 32;
     return kelvin;
    }
    public static double KelvinVersFarenheit(double Tkelvin){
     double kelvin;
     kelvin = (Tkelvin-32)*(9/5) + 273.15;
     return kelvin;
    }
    public static double FarenheitVersKelvin(double Tfarenheit){
     double kelvin;
     kelvin =  (Tfarenheit-273.15)*(5/9) + 32;
     return kelvin;
    }
}
        
   

