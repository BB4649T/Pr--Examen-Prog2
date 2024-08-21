package com.exo;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User {
    private String name;
    private int budgetMonth;
    private List<Depenses> depenses;

    public User(String name, int budgetMonth, List<Depenses> depenses) {
        this.name = name;
        this.budgetMonth = budgetMonth;
        this.depenses = depenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudgetMonth() {
        return budgetMonth;
    }

    public void setBudgetMonth(int budgetMonth) {
        this.budgetMonth = budgetMonth;
    }

    public void addExpense(int montant, String categorie, LocalDate date){
        Depenses nouvelledepenses = new Depenses(montant,categorie,date);
        depenses.add(nouvelledepenses);
        System.out.println("Dépense ajouter" + nouvelledepenses);
    }

    public void getTotalSpentInMonth(){
        YearMonth moisencours = YearMonth.now();
        List<Depenses> depensescemois = depenses.stream().filter(depenses1 -> YearMonth.from(depenses1.getDate))
    }
}
