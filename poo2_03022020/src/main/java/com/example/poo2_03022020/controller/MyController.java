package com.example.poo2_03022020.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * MyController
 */
@Controller
public class MyController {

    @GetMapping("/teste")
    public String index(){
        return "view";
    }

    @GetMapping("/testeModelo")
    public ModelAndView testeModelo(){
        ModelAndView m = new ModelAndView("view");
        m.addObject("msg", "Oi do meu modelo");
        return m;
    }
}