/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_girel;

/**
 *
 * @author danie
 */
public class Convertisseur {
    
   
     int nbConversions;

   
    public Convertisseur() {
        nbConversions = 0;  
    }

  
    public float CelsiusVersKelvin(float tempCelsius) {
        nbConversions++;
        return tempCelsius + 273.15f;
    }

    
    public float KelvinVersCelsius(float tempKelvin) {
        nbConversions++;
        return tempKelvin - 273.15f;
    }

    
    public float FarenheitVersCelsius(float tempFahrenheit) {
        nbConversions++;
        return (tempFahrenheit - 32) * 5 / 9;
    }

    
    public float CelsiusVersFarenheit(float tempCelsius) {
        nbConversions++;
        return (tempCelsius * 9 / 5) + 32;
    }

    
    public float FarenheitVersKelvin(float tempFahrenheit) {
        nbConversions++;
        return CelsiusVersKelvin(FarenheitVersCelsius(tempFahrenheit));
    }

    
    public float KelvinVersFarenheit(float tempKelvin) {
        nbConversions++;
        return CelsiusVersFarenheit(KelvinVersCelsius(tempKelvin));
    }
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

}


