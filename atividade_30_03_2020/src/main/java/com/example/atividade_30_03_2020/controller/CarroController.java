package com.example.atividade_30_03_2020.controller;

import java.util.Collection;

import com.example.atividade_30_03_2020.model.Carro;
import com.example.atividade_30_03_2020.services.CarroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * CarroController
 */
@Controller
public class CarroController {

    @Autowired
    private CarroService cs;

    @GetMapping("/")
    public String Index(){
        return "index";
    }

    @GetMapping("/carro/{id}")
    public ModelAndView getCarroById(@PathVariable("id") Integer id){
        ModelAndView mv;
        Carro carro = cs.getCarroById(id);
        
            if(carro != null){
                mv = new ModelAndView("carroView");

                mv.addObject("carro", carro);

            }
            else{
                mv = new ModelAndView("erroView");
            }

        return mv;        
    }

    @GetMapping("/carros")
    public ModelAndView getCarros(){
        ModelAndView mv = new ModelAndView("carrosView");

        Collection<Carro> carros = cs.getCarros();

        mv.addObject("carros", carros);

        return mv;
    }
    
}