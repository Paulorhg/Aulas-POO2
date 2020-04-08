package com.example.atividade_2_ac1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Funcionario
 */
@Entity
public class Funcionario {

    @Id
    private int id;
    private String nome;
    private String funcao;
    private Double salario;
    private int anoAdmissao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(int anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario [anoAdmissao=" + anoAdmissao + ", funcao=" + funcao + ", id=" + id + ", nome=" + nome
                + ", salario=" + salario + "]";
    }

    
    
}