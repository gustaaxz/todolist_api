package org.example.service;

import java.util.Scanner;

public class LivroService {
    static Scanner sc = new Scanner(System.in);
    public static void cadastrarLivro(){
        System.out.println("Qual o Título do novo livro?: ");
        String tituloLivro = sc.nextLine();

        System.out.println("Qual o Autor do novo livro?: ");
        String autorLivro = sc.nextLine();

        System.out.println("Qual o Ano de Publicação do novo livro?: ");
        String anoPublicacaoLivro = sc.nextLine();
    }

    public static void consultarTodosLivrosCadastrados(){

    }

    public static void registrarEmprestimoLivro(){

    }

    public static void registrarDevolucaoLivro(){

    }
}
