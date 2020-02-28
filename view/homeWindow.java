package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridLayout;

public class homeWindow extends JFrame {

    public homeWindow() {
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.setResizable(true);
        this.setLayout(new GridLayout(2, 1));
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        JButton signIn = new JButton("Sign In");
        signIn.setFont(new Font("Arial", Font.PLAIN, 20));
        bottom.add(signIn);
        JTextField idTextBox = new JTextField("Enter ID number here", 30);
        idTextBox.setFont(new Font("Arial", Font.PLAIN, 20));
        top.add(idTextBox);
        this.add(top);
        this.add(bottom);


        this.pack();
        this.setVisible(true);
    }
}
