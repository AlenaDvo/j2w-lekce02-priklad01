package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class MainController {

    private final Random random = new Random();

    //    @GetMapping("/")
//    public String hoditKostkou() {
//        int nahodneCislo = random.nextInt(1, 6+1);
//        return "kostka";
//    }
    @GetMapping("/")
    public ModelAndView hodKostkou() {
        int nahodneCislo = random.nextInt(1, 6 + 1);
        ModelAndView result = new ModelAndView("kostka");
        result.addObject("cislo", nahodneCislo);
        return result;
    }
}
