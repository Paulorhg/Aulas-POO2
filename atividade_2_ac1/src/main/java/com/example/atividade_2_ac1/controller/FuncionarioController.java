package com.example.atividade_2_ac1.controller;

import com.example.atividade_2_ac1.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService fs;

    @GetMapping("/")
    public ModelAndView getFuncionarios(){

        ModelAndView mv = new ModelAndView("funcionario");

        mv.addObject("funcionarios", fs.getFuncionarios());

        return mv;
    }
}