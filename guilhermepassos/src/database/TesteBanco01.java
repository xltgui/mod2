package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class TesteBanco01 {
    public static void main(String []args){
        // String de conexão: endereço completo para chegar no banco de dados
        var stringConexao = "jdbc:mariadb://localhost/dbexercicio1";
        var user = "root";
        var pw = "univille";
        // Abre conexão com o banco de dados
        try (Connection conn = DriverManager.getConnection(stringConexao, user, pw)) {
            var busca = JOptionPane.showInputDialog(null, "Digite o nome procurado:");

            var sql = "select * from aluno where nome like ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+busca+"%");

                try(ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        System.out.println(rs.getString("numero"));
                        System.out.println(rs.getString("nome"));

                        
                        
                    }
                }
        } catch (SQLException e){
            e.printStackTrace();
        }
        
    }
}
