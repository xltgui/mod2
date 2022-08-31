package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBanco04 {
    public static void main(String[] args) {
        var stringConexao = "jdbc:mariadb://localhost/dbexercicio1";
        var user = "root";
        var pw = "univille";

        try (Connection conn = DriverManager.getConnection(stringConexao, user, pw)) {
            var sql = "delete from aluno where numero = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 100);
            
            var xLinhasAfetadas = ps.executeUpdate();
            System.out.println("Linhas afetadas: " + xLinhasAfetadas);
    

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

