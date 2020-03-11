package com.example.atividade_ac1.model;

/**
 * Produto
 */
public class Produto {

    private int codigo;
    private String nome;
    private Double valor;
    private int estoque;

    public Produto(int codigo, String nome, Double valor, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", estoque=" + estoque + ", nome=" + nome + ", valor=" + valor + "]";
    }

}