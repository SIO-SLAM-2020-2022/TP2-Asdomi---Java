package fr.louis;


import java.time.LocalDate;
import java.time.LocalTime;

public class Prestation {

    private final String libelle;
    private final LocalDate dateSoin;
    private final LocalTime heureSoin;
    private final Intervenant UnIntervenant;

    public Prestation(String Libelle, LocalDate Date_Soin, LocalTime Heure_Soin, Intervenant Un_Intervenant) {
        this.libelle = Libelle;
        this.dateSoin = Date_Soin;
        this.heureSoin = Heure_Soin;
        this.UnIntervenant = Un_Intervenant;
    }

    public int _compareTo(Prestation unePrestation){
        if (this.dateSoin.equals(unePrestation.getDateSoin())){
            return 0;
        } else if (this.dateSoin.isAfter(unePrestation.getDateSoin())) {
            return 1;
        } else{
            return -1;
        }
    }


    public String getLibelle() {
        return libelle;
    }
    public LocalDate getDateSoin() {
        return dateSoin;
    }
    public LocalTime getHeureSoin() {
        return heureSoin;
    }
    public Intervenant getUnIntervenant() {
        return UnIntervenant;
    }

    @Override
    public String toString() {
        return
                "{\n        [:libelle]: " + this.libelle + "\n" +
                        "        [:dateSoin]: " + this.dateSoin + "\n" +
                        "        [:heureSoin]: " + this.heureSoin + "\n" +
                        "        [Prestation:UnIntervenant]: " + this.UnIntervenant + "} \n";

    }

}
