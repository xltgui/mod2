package introducao.telas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class telinha1 extends JFrame {
    public telinha1() {
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");
        JMenuItem menuItem = new JMenuItem("Abrir");
        menu.add(menuItem);
        barraMenu.add(menu);

        setJMenuBar(barraMenu);
        //JLabel texto = new JLabel("eu nao acredito");
        //add(texto,"North");
        JButton botao = new JButton("me clica");
        add(botao,"South");
        JPanel painel = new JPanel();
        add(painel,"Center");
        painel.setBackground(Color.yellow);
        painel.add(new JButton("BOTÃO"));
        painel.add(new JButton("BOTÃO"));
        painel.add(new JButton("BOTÃO"));
        painel.add(new JButton("BOTÃO"));

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new telinha1();
    }

}
