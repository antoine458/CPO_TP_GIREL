/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp2_bieres_girel;

/**
 * @Role du programe ?
 * @Date 11/10/2024
 * @author GIREL Antoine
 * @Groupe TDC
 */
public class TP2_Bieres_GIREL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BouteilleBiere uneBiere22 = new BouteilleBiere("1664", (float) 5.5,"Abbaye de Kronenbourg", false);
        BouteilleBiere uneBiere3 = new BouteilleBiere("Megademon", (float) 16,"Abbaye de Megademon", false);
        BouteilleBiere uneBiere4 = new BouteilleBiere("Desperados", (float) 5.9,"Abbaye du Mexique", false);
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
                7.0, "Dubuisson",false);
        uneBiere.lireEtiquette();
        BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe",
                7.0, "Abbaye Leffe", true);
        uneBiere.lireEtiquette();
        uneBiere.decapsuler(false);
        uneBiere22.decapsuler(true);
        uneBiere2.decapsuler(false);
        uneBiere3.decapsuler(true);
        uneBiere4.decapsuler(false);
        System.out.println(uneBiere);
        System.out.println(uneBiere22);
        System.out.println(uneBiere3);
        System.out.println(uneBiere4);
        System.out.println(uneBiere2);
    }
}
