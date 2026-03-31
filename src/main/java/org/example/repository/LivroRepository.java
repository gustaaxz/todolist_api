package org.example.repository;

import org.example.Conexao;
import org.example.model.Livros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivroRepository {
    static Scanner sc = new Scanner(System.in);
    public static void cadastrarLivroBancoDeDados(Livros livros) throws SQLException {
        String command = """
                INSERT INTO livros
                (titulo, autor, ano)
                VALUES
                (?, ?, ?)
                """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(command)){
            stmt.setString(1, livros.getTitulo());
            stmt.setString(2, livros.getAutor());
            stmt.setInt(3, livros.getAno());
            stmt.execute();
        }
    }

    public static void consultarTodosEmprestimosFeitos() throws SQLException {
        String query = """
                        SELECT e.id, e.livro_id, l.titulo
                        FROM emprestimos e
                        JOIN livros l ON e.livro_id = l.id;
                        """;

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            ResultSet rs = stmt.executeQuery();
            List<Livros> livros = new ArrayList<>();
            while (rs.next()){
                String tituloLivro = rs.getString("l.titulo");
                int idEmprestimo = rs.getInt("e.id");
                int idLivro = rs.getInt("e.livro_id");

                livros.add(new Livros(idEmprestimo, idLivro,tituloLivro));
            }
        } catch (SQLException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public static void consultarTodosLivros() throws SQLException {
        String query = """
                        SELECT titulo, autor, ano 
                        FROM livros
                        """;

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            ResultSet rs = stmt.executeQuery();
            List<Livros> livros = new ArrayList<>();
            while (rs.next()){
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int ano = rs.getInt("ano");

                livros.add(new Livros(titulo, autor, ano));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar todos os livros!");
            e.printStackTrace();
        }
    }

    public static void atualizarStatusDisponibilidadeLivro(Livros livro) throws SQLException {
        String command = """
                UPDATE livros
                SET disponivel = ?
                WHERE id = ?
                """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(command)){
            stmt.setBoolean(1, livro.isDisponivel());
            stmt.setInt(2, livro.getIdLivro());
            stmt.executeUpdate();
        }
    }
}
