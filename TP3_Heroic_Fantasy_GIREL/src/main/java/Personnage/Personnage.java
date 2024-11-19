/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;
import Armes.Arme;
import java.util.ArrayList;
import Armes.Baton;
import Armes.Epee;
import com.mycompany.tp3_heroic_fantasy_girel.etreVivant;



/**
 *
 * @author danie
 */
public abstract class Personnage implements etreVivant {

    private final String nom;
    int NiveauVie;
    public final ArrayList<Arme> inventaire;
    Arme ArmesMain;
    private static int nombresPersonnages = 0;
    static int nombresGuerriers = 0;
    static int nombresMagiciens;

    public Personnage(String nom, int NiveauVie) {
        this.nom = nom;
        this.NiveauVie = NiveauVie;
        this.inventaire = new ArrayList<>();
        this.ArmesMain = null;
        nombresPersonnages++;
    }

    @Override
    public void seFatiguer() {
        NiveauVie -= 10;
    }

    @Override
    public boolean estVivant() {
        return NiveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        NiveauVie -= points;
    }

    @Override
    public void finalize() {
        nombresPersonnages--;
    }

    public void attaque(Personnage autre) {
    }

    public static int getNombresPersonnages() {
        return nombresPersonnages;
    }

    public static int getNombresGuerriers() {
        return nombresGuerriers;
    }

    public static int getNombresMagiciens() {
        return nombresMagiciens;
    }

    public int NiveauViePersonnage() {
        return NiveauVie;
    }

    public String NomPersonnage() {
        return nom;
    }

    public void ajouterArme(Arme Armes) {
        if (inventaire.size() < 5) {
            inventaire.add(Armes);
            System.out.println(Armes.NomArmes() + " ajoutee a l'inventaire de " + NomPersonnage());

        } else {
            System.out.println("Inventaire plein, impossible d'ajouter l'arme.");
        }
    }

    public void equiperArme(Arme nomArme) {
        for (Arme arme : inventaire) {
            if (arme == nomArme) {
                ArmesMain = arme;
                System.out.println("Arme trouvee et equipee : " + ArmesMain);
                return;
            }
        }
        System.out.println("Arme " + nomArme + " non trouvee dans l'inventaire.");
    }

    public Arme getArmesMain() {
        return ArmesMain;
    }

    @Override
    public String toString() {
        String description = "Nom : " + nom + ", Niveau : " + ArmesMain.NiveauArmes();
        if (ArmesMain != null) {
            description += ", Arme en main : " + ArmesMain.NomArmes() + " (Puissance : " + ArmesMain.NiveauArmes() + ")";
        } else {
            description += ", Pas d'arme équipée.";
        }
        return description;
    }
public class Personnage {
    private String nom;
    private int vie;
    private Arme ArmesMain;

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        this.ArmesMain = null; // Arme par défaut : aucune
    }

    public void EquipArme(Arme arme) {
        if (arme != null) {
            this.ArmesMain = arme;
        }
    }

    @Override
    public String toString() {
        String armeEnMain = (this.ArmesMain != null) 
            ? "Niveau: " + this.ArmesMain.NiveauArmes() 
            : "Pas d'arme équipée";

        return "Nom: " + this.nom + ", Niveau de vie: " + this.vie + ", Arme: " + armeEnMain;
    }
}
public class Personnage {
    private String nom;
    private int vie;
    private Arme ArmesMain;

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        this.ArmesMain = null; // Arme par défaut : aucune
    }

    public void EquipArme(Arme arme) {
        if (arme != null) {
            this.ArmesMain = arme;
        }
    }

    @Override
    public String toString() {
        String armeEnMain = (this.ArmesMain != null) 
            ? "Niveau: " + this.ArmesMain.NiveauArmes() 
            : "Pas d'arme équipée";

        return "Nom: " + this.nom + ", Niveau de vie: " + this.vie + ", Arme: " + armeEnMain;
    }
}
public class Personnage {
    private String nom;
    private int vie;
    private Arme ArmesMain;

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        this.ArmesMain = null; // Arme par défaut : aucune
    }

    public void EquipArme(Arme arme) {
        if (arme != null) {
            this.ArmesMain = arme;
        }
    }

    @Override
    public String toString() {
        String armeEnMain = (this.ArmesMain != null) 
            ? "Niveau: " + this.ArmesMain.NiveauArmes() 
            : "Pas d'arme équipée";

        return "Nom: " + this.nom + ", Niveau de vie: " + this.vie + ", Arme: " + armeEnMain;
    }
}
        public class Personnage {
    private String nom;
    private int vie;
    private Arme ArmesMain;

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        this.ArmesMain = null; // Arme par défaut : aucune
    }

    public void EquipArme(Arme arme) {
        if (arme != null) {
            this.ArmesMain = null;
        }
    }

    @Override
    public String toString() {
        String armeEnMain = (this.ArmesMain != null) 
            ? "Niveau: " + this.ArmesMain.NiveauArmes() 
            : "Pas d'arme équipée";

        return "Nom: " + this.nom + ", Niveau de vie: " + this.vie + ", Arme: " + armeEnMain;
    }
    public class Personnage {
    private String nom;
    private int vie;
    private Arme ArmesMain;

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        this.ArmesMain = null; // Arme par défaut : aucune
    }

    public void EquipArme(Arme arme) {
        if (arme != null) {
            this.ArmesMain = arme;
        }
    }

    @Override
    public String toString() {
        String armeEnMain = (this.ArmesMain != null) 
            ? "Niveau: " + this.ArmesMain.NiveauArmes() 
            : "Pas d'arme équipée";

        return "Nom: " + this.nom + ", Niveau de vie: " + this.vie + ", Arme: " + armeEnMain;
    }
public class Personnage {
    private String nom;
    private int vie;
    private Arme ArmesMain;

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        this.ArmesMain = baton; // Arme par défaut : aucune
    }

    public void EquipArme(Arme arme) {
        if (arme != null) {
            this.ArmesMain = arme;
        }
    }

    @Override
    public String toString() {
        String armeEnMain = (this.ArmesMain != null) 
            ? "Niveau: " + this.ArmesMain.NiveauArmes() 
            : "Pas d'arme équipée";

        return "Nom: " + this.nom + ", Niveau de vie: " + this.vie + ", Arme: " + armeEnMain;
    }
            
}

    //public void attaquer(Personnage autre) {
       // int degats = 0;
       // if (ArmesMain != null) {
            
           // if (this instanceof Magicien && ArmesMain instanceof Baton) {
              //  Baton baton = (Baton) ArmesMain;
               // degats = baton.NiveauArmes() * baton.getAgeBaton();  
           // }
           // else if (this instanceof Guerrier && ArmesMain instanceof Epee) {
              //  Epee epee = (Epee) ArmesMain;
            //    degats = epee.NiveauArmes() * epee.getFinesse();  
           // }

            
            //this.seFatiguer();

           
            //if ((this instanceof Magicien && ((Magicien) this).MagicienConfirme())
            //       || (this instanceof Guerrier && ((Guerrier) this).GuerrierCheval())) {
            //    degats /= 2;  
            //}

            
           // autre.estAttaque(degats);
           // System.out.println(this.nom + " inflige " + degats + " degats a " + autre.nom);
        //} else {
        //    System.out.println(this.nom + " n'a pas d'arme equipee et ne peut pas attaquer !");

    

   

        
        
     
    

    

    



