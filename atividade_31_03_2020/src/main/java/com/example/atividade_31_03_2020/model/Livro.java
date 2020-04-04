package com.example.atividade_31_03_2020.model;

/**
 * Livro
 */
public class Livro {
    
    private int id;
    private String nome;
    private String autor;
    private String categoria;
    private int anoLancamento;

    public Livro(int id, String nome, String autor, String categoria, int anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.categoria = categoria;
        this.anoLancamento = anoLancamento;
    }

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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Livro [anoLancamento=" + anoLancamento + ", autor=" + autor + ", categoria=" + categoria + ", id=" + id
                + ", nome=" + nome + "]";
    }

    
    
}