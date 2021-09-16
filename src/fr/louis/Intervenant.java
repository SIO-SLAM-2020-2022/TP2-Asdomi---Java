package fr.louis;

import java.util.ArrayList;

public class Intervenant{

    private final String nom;
    private final String prenom;
    private final ArrayList<Prestation> lesPrestations = new ArrayList<>();

    public Intervenant(String Nom, String Prenom){
        this.nom = Nom;
        this.prenom = Prenom;
    }

    public void ajout_Prestation(Prestation maPrestation){
        this.lesPrestations.add(maPrestation);
    }

    @Override
    public String toString() {
        return
                "{\n            [:nom]: " + this.nom + "\n" +  "            [:prenom]: " + this.prenom + "}";
    }

}
