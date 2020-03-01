package controller;

import view.*;
import model.*;
import model.Course;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Controller implements ActionListener {
    JButton signInButton, cdSignOutButton, cdAddClassButton;
    JTextField homeIdTextField, cdIdTextField;
    HomeWindow homeWindow;
    ClassDirectorWindow classDirectorWindow;
    LoClasses lClasses;

    public Controller() {
        homeWindow = new HomeWindow();
        signInButton = homeWindow.getSignInButton();
        signInButton.addActionListener(this);
        homeIdTextField = homeWindow.getIdText();
        lClasses = new LoClasses();
    }

    public void signIn(String idNo) {
        int idNumber = (Integer.parseInt(idNo))/100;
        if(idNumber == 1){
            classDirector();
        }
    }
    public void signOut(){
        classDirectorWindow.dispose();
        homeIdTextField.setText("Enter ID number here (eg. 232)");
        
    }

    public void classDirector(){
        classDirectorWindow = new ClassDirectorWindow();
        cdAddClassButton = classDirectorWindow.getAddClassButton();
        cdAddClassButton.addActionListener(this);
        cdSignOutButton = classDirectorWindow.getSignOutButton();
        cdSignOutButton.addActionListener(this);
        cdIdTextField = classDirectorWindow.getClassIDText();
    }
    public void addClass(){
        lClasses.add(new Course(cdIdTextField.getText()));
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signInButton){
            signIn(homeIdTextField.getText());
        }
        if(e.getSource() == cdAddClassButton){
            addClass();
        }
        if(e.getSource() == cdSignOutButton){
            signOut();
        }

    }

}