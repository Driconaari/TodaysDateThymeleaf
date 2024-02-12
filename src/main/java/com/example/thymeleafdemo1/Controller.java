package com.example.thymeleafdemo1;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@org.springframework.stereotype.Controller

public class Controller {


    @GetMapping("/hello")
    public String sayHello (Model model) {
        model.addAttribute("hello", "Asger");
    return "greetings";

    }

    @GetMapping("/today")
    public String today(Model model) {
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy"));
        model.addAttribute("today", formattedDate);
        model.addAttribute("dayOfWeek", today.format(DateTimeFormatter.ofPattern("EEEE")));
        return "today";
    }

}


