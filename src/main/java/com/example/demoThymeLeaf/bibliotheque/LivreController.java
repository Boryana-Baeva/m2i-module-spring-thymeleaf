package com.example.demoThymeLeaf.bibliotheque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LivreController {
    @Autowired
    private BibliothequeService bibliothequeService;

    @GetMapping("livres")
    public String showAllLivres(Model model) {
        List<Livre> livres = bibliothequeService.getAll();
        model.addAttribute("livres", livres);

        return "bibliotheque/livres";
    }

    @GetMapping("detail")
    public String showDetailsLivre(@RequestParam int id, Model model) {
        Livre livre = bibliothequeService.getById(id);
        model.addAttribute("livre", livre);

        return "bibliotheque/livre-details";
    }

    @GetMapping("addlivre")
    public String showAddNewLivreForm() {
        return "bibliotheque/livre-add-form";
    }

    @PostMapping("livres")
    public String addNewLivre(Livre livre, Model model) {
        bibliothequeService.add(livre);

        model.addAttribute("livres", bibliothequeService.getAll());
        return "bibliotheque/livres";
    }
}
