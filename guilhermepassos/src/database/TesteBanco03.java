package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBanco03 {
    public static void main(String[] args) {
        var stringConexao = "jdbc:mariadb://localhost/dbexercicio1";
        var user = "root";
        var pw = "univille";

        try (Connection conn = DriverManager.getConnection(stringConexao, user, pw)) {
            var sql = "update aluno set nome = ? where numero = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Mago");
            ps.setInt(2, 7);
            var xLinhasAfetadas = ps.executeUpdate();
            System.out.println("Linhas afetadas: " + xLinhasAfetadas);
    

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
