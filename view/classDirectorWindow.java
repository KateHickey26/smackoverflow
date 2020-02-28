package view;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class classDirectorWindow extends JFrame{
    JPanel main;

    public classDirectorWindow() {
        main = new JPanel();
        main.setBorder(new EmptyBorder(30, 30, 30, 30));
        this.setDefaultCloseOperation(3);
        this.setResizable(true);
        main.setLayout(new GridLayout(2, 1));
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,2));
        top.setLayout(new GridLayout(2,1));
        JButton addClass = new JButton("Add Class");
        addClass.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton signOut = new JButton("Sign Out");
        signOut.setFont(new Font("Arial", Font.PLAIN, 18));
        bottom.add(addClass);
        bottom.add(signOut);
        JLabel info = new JLabel("Class to be Filled:");
        info.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField idTextBox = new JTextField("Enter Class ID. (eg. MATH201)", 30);
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
