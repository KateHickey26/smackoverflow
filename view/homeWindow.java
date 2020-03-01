package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.GridLayout;

public class HomeWindow extends JFrame {
    JPanel main;
    JButton signIn;
    JLabel updateLabel;
    JTextField idTextBox;

    public HomeWindow() {
        this.setTitle("Home");
        main = new JPanel();
        this.setDefaultCloseOperation(3);
        this.setResizable(true);
        main.setBorder(new EmptyBorder(30, 30, 30, 30));
        main.setLayout(new GridLayout(3, 1));
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(2, 1));
        JPanel middle = new JPanel();
        middle.setLayout(new GridLayout(1,1));
        middle.setBorder(new EmptyBorder(0, 60, 0, 60));
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,1));
        signIn = new JButton("Sign In");
        signIn.setFont(new Font("Arial", Font.PLAIN, 20));
        middle.add(signIn);
        JLabel info = new JLabel("Sign in ID:");
        info.setFont(new Font("Arial", Font.PLAIN, 20));
        idTextBox = new JTextField("Enter ID number here (eg. 232)", 30);
        idTextBox.setFont(new Font("Arial", Font.PLAIN, 18));
        top.add(info);
        top.add(idTextBox);
        updateLabel = new JLabel();
        updateLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        bottom.add(updateLabel);
        main.add(top);
        main.add(middle);
        main.add(bottom);
        this.add(main);
        this.pack();
        this.setVisible(true);
    }

    public JButton getSignInButton(){
        return signIn;
    }
    public JTextField getIdText(){
        return idTextBox;
    }
    public JLabel getUpdateLabel(){
        return updateLabel;
    }

}
