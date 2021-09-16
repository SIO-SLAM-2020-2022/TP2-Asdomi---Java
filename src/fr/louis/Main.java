package fr.louis;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {


        /*
          Création des différents dossiers et intervenants
         */
        Dossier dossier = new Dossier("Louis", "Dupont", LocalDate.of(2020,11, 6));
        Dossier dossier2 = new Dossier("Samuel", "Oui", LocalDate.of(2021, 12, 28));

        Intervenant intervenant_1 = new Intervenant("Michel", "Obama");
        Intervenant intervenant_2 = new Intervenant("Jakie", "Onomatopé");
        Intervenant intervenantExterne_1 = new IntervenantExterne("Padrole", "Caroline", "croc-mort", "50 rue de la république", "0985451452");

        /*
          Instanciation des prestations puis dernier paramètre : affectation d'un participant
         */
        Prestation prestation_1 = new Prestation("Soins",
                LocalDate.of(2020, 12, 15),
                LocalTime.of(15, 30, 0),
                intervenantExterne_1
        );
        Prestation prestation_2 = new Prestation("Opération",
                LocalDate.of(2020, 12, 15),
                LocalTime.of(14, 45, 0),
                intervenant_1
        );
        Prestation prestation_3 = new Prestation("Décès",
                LocalDate.of(2021, 6, 3),
                LocalTime.of(19, 26, 0),
                intervenant_2
        );
        Prestation prestation_4 = new Prestation("Décès",
                LocalDate.of(2019, 6, 3),
                LocalTime.of(19, 26, 0),
                intervenant_1
        );


        /*
          Ajout des prestations dans le premier dossier
         */
        dossier.ajout_Prestation(prestation_1);
        dossier.ajout_Prestation(prestation_2);
        dossier.ajout_Prestation(prestation_3);
        dossier.ajout_Prestation(prestation_4);

        /*
         Ajout des prestations dans le second dossier
         */
        dossier2.ajout_Prestation(prestation_1);
        dossier2.ajout_Prestation(prestation_2);

        /*
          On affiche le tout
         */

        //System.out.println(prestation_1 instanceof Prestation);
        //System.out.println(dossier.getNbJourSoins());
        // System.out.println(prestation_1._compareTo(prestation_2));
        System.out.println(dossier.toString());
        // System.out.println(dossier2.toString());
    }
}
