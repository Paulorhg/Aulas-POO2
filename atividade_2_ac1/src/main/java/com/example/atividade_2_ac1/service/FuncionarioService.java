package com.example.atividade_2_ac1.service;

import java.util.List;

import com.example.atividade_2_ac1.entity.Funcionario;
import com.example.atividade_2_ac1.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository fr;

    public List<Funcionario> getFuncionarios(){
        return fr.findAll();
    }
}