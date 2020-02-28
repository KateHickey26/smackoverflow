package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.GridLayout;

public class homeWindow extends JFrame {
    JPanel main;

    public homeWindow() {
        main = new JPanel();
        this.setDefaultCloseOperation(3);
        this.setResizable(true);
        main.setBorder(new EmptyBorder(30, 30, 30, 30));
        main.setLayout(new GridLayout(2, 1));
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(2, 1));
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,1));
        bottom.setBorder(new EmptyBorder(0, 60, 0, 60));
        JButton signIn = new JButton("Sign In");
        signIn.setFont(new Font("Arial", Font.PLAIN, 20));
        bottom.add(signIn);
        JLabel info = new JLabel("Sign in ID:");
        info.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField idTextBox = new JTextField("Enter ID number here (eg. 232)", 30);
        idTextBox.setFont(new Font("Arial", Font.PLAIN, 18));
        top.add(info);
        top.add(idTextBox);
        main.add(top);
        main.add(bottom);

        this.add(main);
        this.pack();
        this.setVisible(true);
    }
}
