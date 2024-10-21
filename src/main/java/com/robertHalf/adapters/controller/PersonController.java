package com.robertHalf.adapters.controller;

import com.robertHalf.application.service.GenderService;
import com.robertHalf.domain.Person;
import com.robertHalf.application.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;
    private final GenderService genderService;

    public PersonController(PersonService personService, GenderService genderService) {
        this.personService = personService;
        this.genderService = genderService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("persons", personService.findAll());
        return "person/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("genders", genderService.findAll());
        return "person/form";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Person person, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("genders", genderService.findAll());
            return "person/form";
        }
        personService.save(person);
        return "redirect:/persons";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        personService.deleteById(id);
        return "redirect:/persons";
    }
}
