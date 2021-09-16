package fr.louis;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dossier {

    private final String nomPatient;
    private final String prenomPatient;
    private final LocalDate dateNaissancePatient;
    private final ArrayList<Prestation> mesPrestations = new ArrayList<>();


    public Dossier(String Nom_Patient, String Prenom_Patient, LocalDate Date_Naissance) {
        this.nomPatient = Nom_Patient;
        this.prenomPatient = Prenom_Patient;
        this.dateNaissancePatient = Date_Naissance;
    }


    public void ajout_Prestation(Prestation maPrestation){
        this.mesPrestations.add(maPrestation);
    }

    public int getNbPrestationsExternes(){
        int counter = 0;
        for (Prestation item : mesPrestations) {
            //if(item.getUnIntervenant() == IntervenantExterne::getClas)
            System.out.println(item);
        }
        return 1;
    }

    public int getNbJourSoins(){
        /*
            Comment ça doit fonctionner (je suppose ???):
            ON PARCOURS LE TABLEAU mesPrestations, on relève uniquement le champ :dateSoin
            TANT QUE :: La date est égale à une autre date, je continue
            SINON :: je fais un compteur qui prend +1 à chaque fois que la date n'est pas la même
            ...*/

        int compteurJours = 0;
        int i = 0;
        while ((this.mesPrestations.get(i).getDateSoin()) != (this.mesPrestations.get(i+1).getDateSoin())){
            i++;
            if (i > this.mesPrestations.size()){
                break;
            }
        }
        compteurJours += 1;
        return compteurJours;
    }

    public void afficheMesPrestations(){
        for (int i = 0; i < this.mesPrestations.size(); i++) {
            System.out.println(this.mesPrestations.get(i).getLibelle() + " :: " + this.mesPrestations.get(i).getDateSoin() + " || " + this.mesPrestations.get(i).getHeureSoin());
        }
    }

    @Override
    public String toString() {
        return
                "[DOSSIER] {\n[:nomPatient]: " + this.nomPatient + "\n" +
                        "[:prenomPatient]: " + this.prenomPatient + "\n" +
                        "[:dateNaissancePatient]: " + this.dateNaissancePatient + "\n" +
                        "[Prestation:mesPrestations]: " + this.mesPrestations + "} \n";

    }

}
