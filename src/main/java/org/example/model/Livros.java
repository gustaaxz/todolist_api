package org.example.model;

public class Livros {
    private int id, ano;
    private String titulo, autor;
    private boolean disponivel;

    public Livros(int id, int ano, String titulo, String autor, boolean disponivel) {
        this.id = id;
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public Livros(int ano, String titulo, String autor, boolean disponivel) {
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
