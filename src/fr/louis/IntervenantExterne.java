package fr.louis;

public class IntervenantExterne extends Intervenant{

    private final String specialite;
    private final String adresse;
    private final String telephone;

    public IntervenantExterne(String Nom, String Prenom, String spe, String adresse, String tel){
        super(Nom, Prenom);
        this.specialite = spe;
        this.adresse = adresse;
        this.telephone = tel;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getSpecialite() {
        return specialite;
    }
}
