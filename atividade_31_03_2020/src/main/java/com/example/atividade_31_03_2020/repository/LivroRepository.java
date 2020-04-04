package com.example.atividade_31_03_2020.repository;

import java.util.Collection;
import java.util.HashMap;

import com.example.atividade_31_03_2020.model.Livro;

import org.springframework.stereotype.Repository;

/**
 * LivroRepository
 */
@Repository
public class LivroRepository {

    public HashMap<Integer, Livro> hm = new HashMap<Integer, Livro>();

    public Collection<Livro> getLivros(){
        return hm.values();
    }
    
     public void setLivro(Livro livro){
        hm.put(livro.getId(), livro);
    }

    public int Tamanho(){
        return hm.size();
    }
}