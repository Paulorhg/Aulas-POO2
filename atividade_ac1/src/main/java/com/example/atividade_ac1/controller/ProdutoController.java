package com.example.atividade_ac1.controller;

import java.util.ArrayList;
import java.util.Collection;

import com.example.atividade_ac1.model.Produto;
import com.example.atividade_ac1.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


/**
 * ProdutoController
 */
@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/")
    public ModelAndView getProdutos(){
        ModelAndView mv = new ModelAndView("produtosView");

        Collection<Produto> produtos = ps.getProdutos();

        mv.addObject("produtos", produtos);

        return mv;
    }

    @GetMapping("/produto/{id}")
    public ModelAndView getProdutoById(@PathVariable("id") Integer id){
        ModelAndView mv;
        Produto produto = ps.getProduto(id);
        
            if(produto != null){
                mv = new ModelAndView("produtoView");

                mv.addObject("produto", produto);

            }
            else{
                mv = new ModelAndView("errorView");
            }
            
            return mv;
    }

    @GetMapping("/produtosEmEstoque")
    public ModelAndView getProdutoByEstoque() {
        ModelAndView mv = new ModelAndView("produtoByEstoqueView");
        
        ArrayList<Produto> produtos = ps.getProdutoByEstoque();

        mv.addObject("produtos", produtos);

        return mv;
    }

    @GetMapping("/produtosValorAcima/{valor}")
    public ModelAndView getProdutoByValorAcima(@PathVariable("valor") Double valor){
        ModelAndView mv = new ModelAndView("produtoValorAcimaView");

        ArrayList<Produto> produtos = ps.getProdutosByValorAcima(valor);

        mv.addObject("produtos", produtos);

        return mv;
    }

    @GetMapping("/produtosValorAbaixo/{valor}")
    public ModelAndView getProdutoByValorAbaixo(@PathVariable("valor") Double valor){
        ModelAndView mv = new ModelAndView("produtoValorAbaixoView");

        ArrayList<Produto> produtos = ps.getProdutosByValorAbaixo(valor);

        mv.addObject("produtos", produtos);


        return mv;
    }
}