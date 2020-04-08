package com.example.atividade_07_04_2020.service;

import java.util.List;

import com.example.atividade_07_04_2020.entity.Aluno;
import com.example.atividade_07_04_2020.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository ar;

    public List<Aluno> getAlunos(){
        return ar.findAll();
    }
}