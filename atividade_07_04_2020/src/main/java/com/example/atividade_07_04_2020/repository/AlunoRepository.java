package com.example.atividade_07_04_2020.repository;

import com.example.atividade_07_04_2020.entity.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}