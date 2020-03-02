package controller;

import view.*;
import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

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
    private LoTeachers lTeachers;
    private Teacher teacherName;
    private Course assignedCourse;

    public Controller() {
        /**
         * creates list of courses instance opens home window and adds event to the sign
         * in button
         */
        lCourses = new LoCourses();
        lTeachers = new LoTeachers();
        try {
            readFileIn("PermanentInfo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        lTeachers.printTeacher();
        homeWindow = new HomeWindow();
        signInButton = homeWindow.getSignInButton();
        signInButton.addActionListener(this);
        homeIdTextField = homeWindow.getIdText();
    }

    public void signIn(String idNo) {
        /**
         * takes the info in the text field when sign in pressed parses to int so can be
         * used if begins in a certain value directs to the right method and therefore
         * window if not valid id no, displays message
         */
        int idNumber = (Integer.parseInt(idNo)) / 100;
        if (idNumber == 1) {
            classDirector();
        }
        if (idNumber == 2) {
            admin();
        }
        if (idNumber == 3) {
            pttDirector();
        } else {
            homeWindow.getUpdateLabel().setText("Invalid ID Number! Enter Valid ID.");
        }
    }

    public void signOutCD() {
        /**
         * for when the sign out button is pressed by the class director ensures there
         * is no invalid ID message on home window closes CD window and repopulates the
         * prompt in the text field on home
         */
        homeWindow.getUpdateLabel().setText("");
        cdWindow.dispose();
        homeIdTextField.setText("Enter ID number here (eg. 232)");
    }

    public void classDirector() {
        /**
         * opens the class director window and adds actions to the buttons initiates
         * local accessibility for certain variables
         */
        cdWindow = new ClassDirectorWindow();
        cdAddClassButton = cdWindow.getAddClassButton();
        cdAddClassButton.addActionListener(this);
        cdSignOutButton = cdWindow.getSignOutButton();
        cdSignOutButton.addActionListener(this);
        cdIdTextField = cdWindow.getClassIDText();
        cdUpdateLabel = cdWindow.getUpdateLabel();
    }

    public void admin() {
        // add admin window code
    }

    public void pttDirector() {
        // add pttDirector window code
    }

    public void addClass(String courseName) {
        /**
         * creates a course based on the name passed then adds this to the list of
         * courses repopulates the textField with class id prompt
         */
        lCourses.addCourse(new Course(courseName));
        cdUpdateLabel.setText("Course: " + courseName + " Added!");
        cdIdTextField.setText("Enter Class ID. (eg. MATH201)");
    }

    public void actionPerformed(ActionEvent e) {
        /**
         * handles all button actions and directs to the right method
         */
        if (e.getSource() == signInButton) {
            signIn(homeIdTextField.getText());
        }
        if (e.getSource() == cdAddClassButton) {
            addClass(cdIdTextField.getText());
        }
        if (e.getSource() == cdSignOutButton) {
            signOutCD();
        }

    }


    public void readFileIn(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            lTeachers.addTeacher(new Teacher(scanner.next()));
            scanner.nextLine();

        }

    /* 
    * 
    */
    public void writeToFile() throws IOException {
        File file = new File("TeachersClasses.txt");
        FileOutputStream fileOut = new FileOutputStream(file);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fileOut));
        for(Teacher teacher : lTeachers.getListOfTeachers()){
            //assignedCourse = hasmap.get(teacher);
            bw.write(teacher + " " + assignedCourse);
            bw.newLine();
        }
        bw.close();
    }
}