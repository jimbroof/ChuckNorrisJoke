package guru.springframework.controllers;

import guru.springframework.model.Joke;
import guru.springframework.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private QuoteService jokeService;

    @Autowired
    public JokeController(QuoteService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";
    }

}
