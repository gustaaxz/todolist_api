package org.example.service;

import org.example.model.Livros;
import org.example.repository.LivroRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class LivroService {
    static Scanner sc = new Scanner(System.in);
    public static void cadastrarLivro(String tituloLivro, String autorLivro, int anoLivro){
        Livros livro = new Livros(tituloLivro, autorLivro, anoLivro);
        try {
            LivroRepository.cadastrarLivroBancoDeDados(livro);
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar o livro!");
        }
    }

    public static void consultarTodosLivrosCadastrados(String titulo, String autor, int ano){
        Livros livro = new Livros(titulo, autor, ano);
        try {
            LivroRepository.consultarTodosLivros();
        } catch (SQLException e) {
            System.out.println("Erro ao consultar todos os livros cadastrados!");
        }
    }
}
