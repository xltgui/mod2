package sistema.controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComponent;

import sistema.dao.ClienteDAO;
import sistema.service.clienteService;

public class FormularioAlterarClienteController implements ActionListener {
    private FormularioAlterarCliente alterar;
    

    public FormularioAlterarClienteController(FormularioAlterarCliente alterar){
        this.alterar = alterar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent botaoClicado = (JComponent) e.getSource();
        if (botaoClicado.getName().equals("btnOk")) {
            btnOkClique();
        }
        if (botaoClicado.getName().equals("btnCancelar")) {
            btnCancelarClique();
        }
    }

    private void btnCancelarClique() {
        alterar.dispose();
    }

    private void btnOkClique() {
        System.out.println(alterar.getId());
        ClienteDAO clienteDAO = new ClienteDAO();
        try{
            clienteDAO.buscarCliente(alterar.getId());

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    

    

}
