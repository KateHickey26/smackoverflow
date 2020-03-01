package controller;
import view.*;
import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Controller implements ActionListener {
    private JButton signInButton, cdSignOutButton, cdAddClassButton;
    private JTextField homeIdTextField, cdIdTextField;
    private JLabel cdUpdateLabel;
    private HomeWindow homeWindow;
    private ClassDirectorWindow cdWindow;
    private LoCourses lCourses;

    public Controller() {
        lCourses = new LoCourses();
        homeWindow = new HomeWindow();
        signInButton = homeWindow.getSignInButton();
        signInButton.addActionListener(this);
        homeIdTextField = homeWindow.getIdText();
    }

    public void signIn(String idNo) {
        int idNumber = (Integer.parseInt(idNo))/100;
        if(idNumber == 1){
            classDirector();
        }
        if(idNumber == 2){
            admin();
        }
        if(idNumber == 3){
            pttDirector();
        }
    }
    public void signOut(){
        cdWindow.dispose();
        homeIdTextField.setText("Enter ID number here (eg. 232)");
        
    }
    public void classDirector(){
        cdWindow = new ClassDirectorWindow();
        cdAddClassButton = cdWindow.getAddClassButton();
        cdAddClassButton.addActionListener(this);
        cdSignOutButton = cdWindow.getSignOutButton();
        cdSignOutButton.addActionListener(this);
        cdIdTextField = cdWindow.getClassIDText();
        cdUpdateLabel = cdWindow.getUpdateLabel();
    }
    public void admin(){

    }

    public void pttDirector(){

    }
    public void addClass(String courseName){
        lCourses.addCourse(new Course(courseName));
        cdUpdateLabel.setText("course " + courseName + " added");
        cdIdTextField.setText("Enter Class ID. (eg. MATH201)");
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signInButton){
            signIn(homeIdTextField.getText());
        }
        if(e.getSource() == cdAddClassButton){
            addClass(cdIdTextField.getText());
        }
        if(e.getSource() == cdSignOutButton){
            signOut();
        }

    }

}