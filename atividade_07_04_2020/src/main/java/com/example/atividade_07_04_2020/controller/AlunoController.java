package com.example.atividade_07_04_2020.controller;

import com.example.atividade_07_04_2020.service.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoController {

    @Autowired
    private AlunoService as;

    @GetMapping("/alunos")
    public ModelAndView getAlunos(){

        ModelAndView mv = new ModelAndView("alunos");
        mv.addObject("alunos", as.getAlunos());

        return mv;
    } 

}