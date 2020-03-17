package com.example.atividade_ac1.repository;

import java.util.Collection;
import java.util.HashMap;

import com.example.atividade_ac1.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer, Produto> hm = new HashMap<Integer, Produto>();

    public ProdutoRepository() {
        hm.put(0, new Produto(0, "Carne", 20.0, 10));
        hm.put(1, new Produto(1, "Papel", 7.2, 20));
        hm.put(2, new Produto(2, "Refrigerante", 4.5, 40));
        hm.put(3, new Produto(3, "Cerveja", 29.7, 1));
        hm.put(4, new Produto(4, "Pipoca", 60.1, 7));
        hm.put(5, new Produto(5, "Ovo", 2.0, 4));
        hm.put(6, new Produto(6, "Suco", 35.35, 30));
        hm.put(7, new Produto(7, "Cafe", 5.2, 100));
        hm.put(8, new Produto(8, "Camiseta", 10.6, 0));
        hm.put(9, new Produto(9, "Chocolate", 12.55, 9));
    }

    public Produto getProdutoById(int id) {
        return hm.get(id);
    }

    public Collection<Produto> getProdutos() {
        return hm.values();
    }
}