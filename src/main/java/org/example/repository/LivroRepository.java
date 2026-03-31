package org.example.repository;

import java.util.Scanner;

public class LivroRepository {
    static Scanner sc = new Scanner(System.in);
    public static void inserirLivroBancoDeDados(){

    }

    public static void consultarTodosLivros(){
        System.out.println("Qual método de consulta você deseja acessar?: \n1 - Todos os Livros Cadastrados\n2 - Todos os Empréstimos Realizados");
        System.out.println("Escolha: ");
        sc.nextLine();
        int escolhaOpcaoConsultas = sc.nextInt();
    }

    public static void atualizarStatusDisponibilidadeLivro(){

    }
}
