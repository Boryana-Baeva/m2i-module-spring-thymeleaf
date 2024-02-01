package com.example.demoThymeLeaf.bibliotheque;

import java.time.LocalDate;

public class Livre {
    private int id;
    private String titre;
    private String auteur;
    private LocalDate dateParution;
    private String resume;

    public Livre() {
    }

    public Livre(String titre, String auteur, LocalDate dateParution, String resume) {
        this.titre = titre;
        this.auteur = auteur;
        this.dateParution = dateParution;
        this.resume = resume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public LocalDate getDateParution() {
        return dateParution;
    }

    public void setDateParution(LocalDate dateParution) {
        this.dateParution = dateParution;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", dateParution=" + dateParution +
                ", resume='" + resume + '\'' +
                '}';
    }
}
