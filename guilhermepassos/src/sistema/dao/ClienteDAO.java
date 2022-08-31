package sistema.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.mariadb.jdbc.client.PrepareCache;

import sistema.entity.Cliente;

public class ClienteDAO {

    public Cliente buscarCliente(Long id) throws Exception {
        Conexaodb.getInstance().getConn();
        var sql = "select * from cliente where id = ?";

        PreparedStatement ps = Conexaodb.getInstance().getConn().prepareStatement(sql);
        ps.setLong(1, id);

        ResultSet rs = ps.executeQuery();
        Cliente novoCliente = new Cliente();
        while (rs.next()) {
            // ORM - Object Relational Mapping (Mapeamento Objeto Relacional)

            novoCliente.setId(rs.getLong("id"));
            novoCliente.setNome(rs.getString("nome"));
            novoCliente.setCpf(rs.getString("cpf"));
            novoCliente.SetNascimento(rs.getDate("datanascimento"));
            // novoCliente.setDataNascimento(dataNascimento);
        }

        return novoCliente;

    }

    public ArrayList<Cliente> getAll() {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try {
            var conn = Conexaodb.getInstance().getConn();
            var sql = "SELECT * FROM cliente";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // ORM - Object Relational Mapping (Mapeamento Objeto Relacional)
                Cliente novoCliente = new Cliente();
                novoCliente.setId(rs.getLong("id"));
                novoCliente.setNome(rs.getString("nome"));
                novoCliente.setCpf(rs.getString("cpf"));
                novoCliente.SetNascimento(rs.getDate("datanascimento"));
                // novoCliente.setDataNascimento(dataNascimento);
                lista.add(novoCliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void save(Cliente cliente) throws SQLException {
        // olhar o ID do cliente
        // se o ID == 0 -> Executar insert no banco
        // SE o ID != 0 -> Executar update

        if (cliente.getId() == 0) {
            Conexaodb.getInstance().getConn();
            var sql = "insert into cliente(nome, cpf, datanascimento) VALUES(?, ?, ?)";

            PreparedStatement ps = Conexaodb.getInstance().getConn().prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            ps.setString(3, sdf.format(cliente.getNascimento()));

            var numLinhasAFetadas = ps.executeUpdate();
            System.out.println("Número de linhas afetadas: " + numLinhasAFetadas);
        }else {
            var sql = "update cliente set nome = ?, cpf = ?, datanascimento = ?  where id = ?";
            PreparedStatement ps = Conexaodb.getInstance().getConn().prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            ps.setString(3, sdf.format(cliente.getNascimento()));

            ps.setLong(4, cliente.getId());

            var xLinhasAfetadas = ps.executeUpdate();
            System.out.println("Quantidade de linhas afetadas: " + xLinhasAfetadas);
        }
    }

    public Cliente getClienteById(long id)  {
        Cliente cliente = new Cliente();
        try {
            Conexaodb.getInstance().getConn();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        var sql = "SELECT * FROM cliente where id = ?";
        try (PreparedStatement ps = Conexaodb.getInstance().getConn().prepareStatement(sql)) {
            ps.setLong(1, cliente.getId());

            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                cliente.setId(rs.getLong("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.SetNascimento(sdf.parse(rs.getString("datanascimento")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

            

        return cliente;
    }
    

    public void delete(long id) {
        try (var conn = Conexaodb.getInstance().getConn()) {
            var sql = "delete from cliente where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, id);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

}
