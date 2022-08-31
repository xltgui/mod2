package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
import sistema.exception.ValorInvalidoException;
import sistema.view.FormularioCliente;

public class FormularioClienteController implements ActionListener {

    private FormularioCliente formCliente;

    public FormularioClienteController(FormularioCliente formCliente) {
        this.formCliente = formCliente;
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
        formCliente.dispose();
    }

    private void btnOkClique() {
        try{
        var cliente = formCliente.getCliente();
        formCliente.atualiza(cliente);

            //validadorCPF(cliente);

            validador(cliente);
            

            //validadorId(cliente);

            formCliente.dispose();

        } catch (ValorInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    private boolean validador(Cliente cliente) throws ValorInvalidoException{
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new ValorInvalidoException("O nome não pode ser deixado em branco", null, "NOME");
        }
        String mascaraDoCpf = "###########";

        if (cliente.getCpf().replace("." , "").replace("-" , "").isEmpty()){

            throw new ValorInvalidoException("O CPF não pode ficar em branco", null, "CPF");

            //System.out.println(cliente.getCpf());
        }
        /*if (Long.valueOf(cliente.getId()) == null || cliente.getId() == 0){
            throw new ValorInvalidoException("O ID não pode ficar em branco", null, "ID");
        }
        if (cliente.getNascimento() == null || cliente.getNascimento().equals(null) ){
            throw new ValorInvalidoException("O valor da data não pode ficar vazio", null, "DATA");
        }
        */

        return true;
    }


    /*private boolean validadorId(Cliente cliente) throws ValorInvalidoException{
        if(Long.valueOf(cliente.getId()) == null || cliente.getId() == 0){
            throw new ValorInvalidoException("O ID não pode ficar em branco", null, "ID");
        }
        return true;
        */
    }

