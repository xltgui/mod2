package sistema.controller;


import javax.swing.JComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import sistema.entity.Cliente;

import sistema.service.clienteService;
import sistema.view.FormularioCliente;
import sistema.view.listagemClientes;

public class listagemClienteController implements ActionListener {
    private clienteService service = new clienteService();
    private listagemClientes model;

    private listagemClientes view;

    public listagemClienteController(listagemClientes view){
        this.view = view;
    }
    
    public ArrayList<Cliente> getAllClientes(){
        return service.getAllClientes();
    }


    public listagemClientes linkListagemCliente(listagemClientes model){
        return this.model = model;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent botaoClicado = (JComponent) e.getSource();
        switch (botaoClicado.getName()) {
            case "btnNovo":
                try {
                    btnNovoClick();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                break;
            case "btnAlterar":
                try {
                    btnAlterarClick();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                break;
            case "btnExcluir":
                btnExcluirClick();
                break;
        }
    }

    private void btnNovoClick() throws Exception {
        //JOptionPane.showMessageDialog(null, "novo");
        Cliente novoCliente = new Cliente();
        FormularioCliente formulario = new FormularioCliente(novoCliente);
        service.save(novoCliente);
        view.atualizaTabela();
    }

    private void btnAlterarClick() throws Exception {
        //JOptionPane.showMessageDialog(null, "alterar");
        var clienteClicado = view.getCliente();
        if(clienteClicado != null){
            FormularioCliente formulario = new FormularioCliente(clienteClicado);
            service.save(clienteClicado);
            view.atualizaTabela();
        }
    }

    private void btnExcluirClick() {
        //JOptionPane.showMessageDialog(null, "excluir");
        var clienteClicado = view.getCliente();
        if(clienteClicado != null){
            var numBotao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja exlcuir esse registro?");
            if(numBotao == 0){
                
            service.remove(clienteClicado);
            }
            view.atualizaTabela();
        }
    }

}
