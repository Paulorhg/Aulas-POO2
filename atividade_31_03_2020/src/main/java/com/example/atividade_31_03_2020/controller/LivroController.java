package com.example.atividade_31_03_2020.controller;

import java.util.Collection;

import com.example.atividade_31_03_2020.model.Livro;
import com.example.atividade_31_03_2020.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * LivroController
 */
@Controller
public class LivroController {

    @Autowired
    private LivroService ls;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");

        Collection<Livro> livros = ls.getLivros();

        mv.addObject("livros", livros);

        return mv;
    }

    @PostMapping("/")
    public ModelAndView livroForm(@ModelAttribute Livro livro){
        ModelAndView mv = new ModelAndView("index");
        ls.setLivro(livro);

        Collection<Livro> livros = ls.getLivros();

        mv.addObject("livros", livros);
        return mv;
    }
    
}