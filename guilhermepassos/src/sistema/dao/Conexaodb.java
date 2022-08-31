package sistema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexaodb {
    private Connection conn;
    private String stringConexao = "jdbc:mariadb://localhost/dbsistema";
    private String user = "root";
    private String pw = "univille";
    private static Conexaodb instance;


    private Conexaodb() throws SQLException {
        this.conn = DriverManager.getConnection(stringConexao, user, pw);

    }

    public static Conexaodb getInstance() throws SQLException {
        if(instance == null){
            instance = new Conexaodb();
        }
        return instance;
    }
    public Connection getConn(){
        return this.conn;
    }
}
