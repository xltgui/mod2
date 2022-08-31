package sistema.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import sistema.dao.ClienteDAO;
import sistema.entity.Cliente;

public class clienteService {

    private ClienteDAO clienteDAO = new ClienteDAO();

    //private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public clienteService(){
        /*var cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setCpf("555.555.555-11");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 05, 12);
        cliente1.SetNascimento(calendario.getTime());
        listaClientes.add(cliente1);

        var cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Joãozinho");
        cliente2.setCpf("111.111.111-11");
        Calendar calendario2 = GregorianCalendar.getInstance();
        calendario2.set(2022, 06, 1);
        cliente2.SetNascimento(calendario2.getTime());
        listaClientes.add(cliente2);

        var cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Julinha");
        cliente3.setCpf("222.222.222-22");
        Calendar calendario3 = GregorianCalendar.getInstance();
        calendario3.set(2004, 04, 04);
        cliente3.SetNascimento(calendario3.getTime());
        listaClientes.add(cliente3);
        */
    }

    public ArrayList<Cliente> getAllClientes(){
        return clienteDAO.getAll();
    }
    
    public Cliente save(Cliente cliente) throws Exception{
        //listaClientes.add(cliente);
        clienteDAO.save(cliente);

        return cliente;
    }

    public void remove(Cliente cliente) {
        clienteDAO.delete(cliente.getId());
    }



}
