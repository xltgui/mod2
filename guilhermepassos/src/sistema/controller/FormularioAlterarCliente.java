package sistema.controller;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import sistema.view.FormularioCliente;

public class FormularioAlterarCliente extends JDialog {
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOK = new JButton("OK");
    private FormularioAlterarClienteController controller = new FormularioAlterarClienteController(this);
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txtId = new JTextField("dsa");

    public FormularioAlterarCliente() {
        setSize(400, 300);
        setModal(true); // bloquear o usuário na JDialog
        criaPaineis(); // nao esquece de chamar o metodo aqui!!!
        setVisible(true);
    }

    public long getId(){
        return Long.parseLong(txtId.getText());
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

        
    }


    
}
