package de.segoy.springframework.chucknorrisforactuator.controller;

import de.segoy.springframework.chucknorrisforactuator.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokesController {

    JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getJokes(Model model) {
        model.addAttribute("joke",jokesService.getQuote());
        return "index";
    }
}
