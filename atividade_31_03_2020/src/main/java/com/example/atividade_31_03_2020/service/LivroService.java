package com.example.atividade_31_03_2020.service;

import java.util.Collection;

import com.example.atividade_31_03_2020.model.Livro;
import com.example.atividade_31_03_2020.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * LivroService
 */
@Service
public class LivroService {

    @Autowired
    private LivroRepository lr;

    public Collection<Livro> getLivros(){
        return lr.getLivros();
    }

    public void setLivro(Livro livro){
        
        for (Livro l : lr.getLivros()) {
            if(l.getNome().equals(livro.getNome()) && l.getAutor().equals(livro.getAutor()))
                return;
        }
        
        livro.setId((lr.Tamanho() + 1));
        lr.setLivro(livro);
    }
}