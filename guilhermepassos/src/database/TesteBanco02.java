package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBanco02 {
    public static void main(String[] args){
       var stringConexao = "jdbc:mariadb://localhost/dbexercicio1";
       var user = "root";
       var pw = "univille";
        
       try(Connection conn = DriverManager.getConnection(stringConexao, user, pw)){
        var sql = "insert into aluno(nome) values(?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "Maga Patalógica");
        
        var numLinhasAFetadas = ps.executeUpdate();
        System.out.println("Número de linhas afetadas: " + numLinhasAFetadas);
           

       } catch (SQLException e){
        e.printStackTrace();
       }


    }
    

}
