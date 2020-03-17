package com.example.atividade_ac1.services;

import java.util.ArrayList;
import java.util.Collection;

import com.example.atividade_ac1.model.Produto;
import com.example.atividade_ac1.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProdutoService
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository pr;

    public Collection<Produto> getProdutos(){
        return pr.getProdutos();
    }

    public Produto getProduto(int id){

        Produto produto = pr.getProdutoById(id);

        return produto;

    }

    public ArrayList<Produto> getProdutoByEstoque(){
        Collection<Produto> cp = pr.getProdutos();
        ArrayList<Produto> cpr = new ArrayList<Produto>();
        for (Produto produto : cp) {
            if(produto.getEstoque() > 0)
                cpr.add(produto);
        }

        return cpr;
    }

    public ArrayList<Produto> getProdutosByValorAcima(Double valor){
        Collection<Produto> cp = pr.getProdutos();
        ArrayList<Produto> cpr = new ArrayList<Produto>();
        for (Produto produto : cp) {
            if(produto.getValor() > valor)
                cpr.add(produto);
        }

        return cpr;
    }

    public ArrayList<Produto> getProdutosByValorAbaixo(Double valor){
        Collection<Produto> cp = pr.getProdutos();
        ArrayList<Produto> cpr = new ArrayList<Produto>();
        for (Produto produto : cp) {
            if(produto.getValor() < valor)
                cpr.add(produto);
        }

        return cpr;
    }

}