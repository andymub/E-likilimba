package com.e_likilimba.Objet;

import android.widget.ImageButton;

public class CaisseSolidaireObjet {

    String nomDeCaisseSolidaire, nombreParticipantCaisseSolidaire,
            typerDevise,prixDuCompte,dureeAvantRetrait,
            dateDeDebut, situatioActuelle;
    ImageButton deleteGroupeCs, addToGroupeCs;

    public CaisseSolidaireObjet(String nomDeCaisseSolidaire, String typerDevise, String nombreParticipantCaisseSolidaire, String prixDuCompte, String dureeAvantRetrait, String dateDeDebut, String situatioActuelle) {
        this.nomDeCaisseSolidaire = nomDeCaisseSolidaire;
        this.nombreParticipantCaisseSolidaire = nombreParticipantCaisseSolidaire;
        this.prixDuCompte = prixDuCompte;
        this.dureeAvantRetrait = dureeAvantRetrait;
        this.dateDeDebut = dateDeDebut;
        this.situatioActuelle = situatioActuelle;
        this.typerDevise=typerDevise;
    }

    public String getTyperDevise() {
        return typerDevise;
    }

    public void setTyperDevise(String typerDevise) {
        this.typerDevise = typerDevise;
    }

    public String getNomDeCaisseSolidaire() {
        return nomDeCaisseSolidaire;
    }

    public void setNomDeCaisseSolidaire(String nomDeCaisseSolidaire) {
        this.nomDeCaisseSolidaire = nomDeCaisseSolidaire;
    }

    public String getNombreParticipantCaisseSolidaire() {
        return nombreParticipantCaisseSolidaire;
    }

    public void setNombreParticipantCaisseSolidaire(String nombreParticipantCaisseSolidaire) {
        this.nombreParticipantCaisseSolidaire = nombreParticipantCaisseSolidaire;
    }

    public String getPrixDuCompte() {
        return prixDuCompte;
    }

    public void setPrixDuCompte(String prixDuCompte) {
        this.prixDuCompte = prixDuCompte;
    }

    public String getDureeAvantRetrait() {
        return dureeAvantRetrait;
    }

    public void setDureeAvantRetrait(String dureeAvantRetrait) {
        this.dureeAvantRetrait = dureeAvantRetrait;
    }

    public String getDateDeDebut() {
        return dateDeDebut;
    }

    public void setDateDeDebut(String dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }

    public String getSituatioActuelle() {
        return situatioActuelle;
    }

    public void setSituatioActuelle(String situatioActuelle) {
        this.situatioActuelle = situatioActuelle;
    }
}
