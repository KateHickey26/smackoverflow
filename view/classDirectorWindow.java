package view;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ClassDirectorWindow extends JFrame{
    JPanel main;
    JButton addClass, signOut;
    JTextField idTextBox;

    public ClassDirectorWindow() {
        main = new JPanel();
        main.setBorder(new EmptyBorder(30, 30, 30, 30));
        this.setDefaultCloseOperation(3);
        this.setResizable(true);
        main.setLayout(new GridLayout(2, 1));
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,2));
        top.setLayout(new GridLayout(2,1));
        addClass = new JButton("Add Class");
        addClass.setFont(new Font("Arial", Font.PLAIN, 18));
        signOut = new JButton("Sign Out");
        signOut.setFont(new Font("Arial", Font.PLAIN, 18));
        bottom.add(addClass);
        bottom.add(signOut);
        JLabel info = new JLabel("Class to be Filled:");
        info.setFont(new Font("Arial", Font.PLAIN, 20));
        idTextBox = new JTextField("Enter Class ID. (eg. MATH201)", 30);
        idTextBox.setFont(new Font("Arial", Font.PLAIN, 18));
        top.add(info);
        top.add(idTextBox);
        main.add(top);
        main.add(bottom);


        this.add(main);
        this.pack();
        this.setVisible(true);
    }
    public JButton getAddClassButton(){
        return addClass;
    }
    public JButton getSignOutButton(){
        return signOut;
    }
    public JTextField getClassIDText(){
        return idTextBox;
    }
}
