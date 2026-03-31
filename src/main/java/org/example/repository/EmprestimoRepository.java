package org.example.repository;

import java.util.Scanner;

public class EmprestimoRepository {
    static Scanner sc = new Scanner(System.in);
    public static void registrarEmprestimosLivro(){
        System.out.println("Qual o ID do livro que deseja fazer um empréstimo?: ");
        sc.nextLine();
        int idLivroEmprestimo = sc.nextInt();

        System.out.println("Qual o seu CPF?: ");
        String cpfEmprestimo = sc.nextLine();

        /*

        O livro deve ser marcado como não disponível no banco de dados e o empréstimo
        registrado na tabela emprestimos

        */
    }

    public static void registrarDevolucaoLivro(){
        System.out.println("Qual o ID do empréstimo?: ");
        int idLivroDevolucao = sc.nextInt();

        System.out.println("Qual a Data de Devolução do livro?: ");
        String dataDevolucao = sc.nextLine();

        /*

        O livro deve ser marcado novamente como disponível no banco de dados

         */
    }
}
