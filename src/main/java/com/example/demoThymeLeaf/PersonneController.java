package com.example.demoThymeLeaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonneController {

    @GetMapping("hello")
    public String hello(Model model){
        String prenom = "Jean-Christophe";
        model.addAttribute("prenom", prenom);

        return "hello.html";
    }

    @GetMapping("personnes")
    public String personnes(Model model) {
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("James", "Bond", 33));
        personnes.add(new Personne("JC", "Dominguez", 25));
        personnes.add(new Personne("Marie", "Dupond", 17));

        model.addAttribute("listePersonnes", personnes);
        return "personnes";
    }

    @GetMapping("agepersonne")
    public String agePersonne(Model model) {
        ///model.addAttribute("personne", new Personne("James", "Bond", 33));
        model.addAttribute("personne", new Personne("Marie", "Dupond", 17));
        return "agepersonne";
    }
}