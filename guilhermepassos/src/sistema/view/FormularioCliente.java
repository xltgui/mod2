package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import sistema.controller.FormularioClienteController;
import sistema.dao.ClienteDAO;
import sistema.entity.Cliente;
import sistema.exception.ValorInvalidoException;

import java.awt.GridBagLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.GridBagConstraints;

public class FormularioCliente extends JDialog {
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOK = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txtId = new JTextField(4);
    private JTextField txtNome = new JTextField(40);
    private MaskFormatter mascaraCPF;
    private JFormattedTextField txtCPF;
    private MaskFormatter mascaraData;
    private JFormattedTextField txtData;
    private FormularioClienteController controller = new FormularioClienteController(this);
    private Cliente cliente = new Cliente();

    public FormularioCliente(Cliente cliente) {
        
        this.cliente = cliente;

        setSize(400, 300);
        setModal(true); // bloquear o usuário na JDialog
        criaPaineis(); // nao esquece de chamar o metodo aqui!!!
        atualizaCampos();
        setVisible(true);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private void atualizaCampos(){
        if(this.cliente != null){
            txtId.setText(String.valueOf(this.cliente.getId()));
            txtNome.setText(this.cliente.getNome());
            txtCPF.setText(this.cliente.getCpf());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try{
                txtData.setText(sdf.format(this.cliente.getNascimento()));
        }catch (Exception e) {}
    }
    }

    private void criaPaineis() {
        add(jpnBotao, "South");
        jpnBotao.add(btnOK);
        btnOK.addActionListener(controller);
        btnOK.setName("btnOk");
        jpnBotao.add(btnOK);
        btnCancelar.addActionListener(controller);
        btnCancelar.setName("btnCancelar");
        jpnBotao.add(btnCancelar);

        jpnCentro.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.fill = GridBagConstraints.HORIZONTAL;

        add(jpnCentro, "Center");
        cons.gridx = 0; // coluna 0
        cons.gridy = 0; // linha 0
        cons.weightx = 0.20; // largura em percentual
        jpnCentro.add(new JLabel("Código:"), cons);

        cons.gridx = 1; // coluna 1
        cons.gridy = 0; // linha 0
        cons.weightx = 0.80; // largura em percentual
        jpnCentro.add(txtId, cons);
        cons.gridx = 0; // coluna 0
        cons.gridy = 1; // linha 1
        cons.weightx = 0.20; // largura em percentual
        jpnCentro.add(new JLabel("Nome:"), cons);
        cons.gridx = 1; // coluna 1
        cons.gridy = 1; // linha 1
        cons.weightx = 0.80; // largura em percentual
        jpnCentro.add(txtNome, cons);

        cons.gridx = 0; // coluna 0
        cons.gridy = 2; // linha 2
        cons.weightx = 0.20; // largura em percentual
        jpnCentro.add(new JLabel("CPF:"), cons);

        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            txtCPF = new JFormattedTextField(mascaraCPF);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        cons.gridx = 1; // coluna 1
        cons.gridy = 2; // linha 2
        cons.weightx = 0.80; // largura em percentual
        jpnCentro.add(txtCPF, cons);

        cons.gridx = 0; // coluna 0
        cons.gridy = 3; // linha 3
        cons.weightx = 0.20; // largura em percentual
        jpnCentro.add(new JLabel("Data Nascimento:"), cons);

        try {
            mascaraData = new MaskFormatter("##/##/####");
            txtData = new JFormattedTextField(mascaraData);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        cons.gridx = 1; // coluna 1
        cons.gridy = 3; // linha 3
        cons.weightx = 0.80; // largura em percentual
        jpnCentro.add(txtData, cons);

        
    }
    public MaskFormatter getMascaraCPF() {
        return mascaraCPF;
    }

    public void setMascaraCPF(MaskFormatter mascaraCPF) {
        this.mascaraCPF = mascaraCPF;
    }

    public Cliente atualiza (Cliente cliente) throws ValorInvalidoException{
            // atualiza com os dados da tela (BINDING)
            try{
            cliente.setId(Long.parseLong(txtId.getText()));
            } catch (NumberFormatException e){
                throw new ValorInvalidoException("Campo código deve conter números", e, "CÓDIGO");
            }
            cliente.setNome(txtNome.getText());
            cliente.setCpf(txtCPF.getText());;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                cliente.SetNascimento(sdf.parse(txtData.getText()));

            } catch (ParseException e) {
                throw new ValorInvalidoException("Valor de data inválido", e, "DATA DE NASCIMENTO");
            }
            try{
                ClienteDAO clienteDAO = new ClienteDAO();
                clienteDAO.save(cliente);
            }catch (Exception e) {
                throw new RuntimeException("Erro ao persistir dados" + e.getMessage());
            }
            
            return cliente;

        }
}
