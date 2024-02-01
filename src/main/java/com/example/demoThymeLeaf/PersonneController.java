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
        personnes.add(new Personne("James", "Bond"));
        personnes.add(new Personne("JC", "Dominguez"));
        personnes.add(new Personne("Marie", "Dupond"));

        model.addAttribute("listePersonnes", personnes);
        return "personnes";
    }
}