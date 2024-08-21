package com.exo;

import java.time.LocalDate;
import java.util.Date;

public class Depenses {
    private String description;

    public Depenses(int montant, String categorie, LocalDate date) {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public Depenses(String description, int montant, String categorie, Date date) {
        this.description = description;
        this.montant = montant;
        this.categorie = categorie;
    }

    private int montant;
    private String categorie;

    public int getMontant() {
        return montant;
    }

    private LocalDate date;

    public void setCategorie(String categorie){
        if (categorie != "Nourriture et restauration" || categorie != "Transport" ||
        categorie != "Divertissement" || categorie != "Services publics" || categorie != "Autres"){
            try {
                throw new IllegalAccessException("La categorie est incorect");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        this.categorie = categorie;
    }

    public LocalDate getDate() {
        LocalDate date = LocalDate.now();
        return date;
    }
}
