package com.example.demoThymeLeaf.bibliotheque;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Service
public class BibliothequeService {
    private HashMap<Integer, Livre> livres = new HashMap<>();
    private int idCounter;

    public BibliothequeService() {
        generateExempleContent();
    }

    public List<Livre> getAll() {
        return livres.values().stream().toList();
    }

    public void add(Livre livre) {
        idCounter++;
        livre.setId(idCounter);
        livres.put(idCounter, livre);
    }

    public Livre getById(int id) {
        return livres.get(id);
    }

    private void generateExempleContent() {
        Livre livre1 = new Livre("The Catcher in the Rye", "J.D. Salinger", LocalDate.of(1951, 7, 16), "A classic novel");
        Livre livre2 = new Livre("To Kill a Mockingbird", "Harper Lee", LocalDate.of(1960, 7, 11), "A Pulitzer Prize-winning novel");
        Livre livre3 = new Livre("1984", "George Orwell", LocalDate.of(1949, 6, 8), "A dystopian novel");

        add(livre1);
        add(livre2);
        add(livre3);
    }

}
