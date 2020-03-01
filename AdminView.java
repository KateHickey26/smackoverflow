import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.LoClasses;
import model.LoTeachers;
import model.Teacher;

public class AdminView extends JFrame implements ActionListener {
	JFrame frame;
	LoTeachers teachers;
	LoClasses classes;
	
	public AdminView(LoTeachers teachers, LoClasses classes) {
		this.teachers = teachers;
		this.classes = classes;
		
		setAdminView();
		
	}
	
	public void setAdminView() {
		frame = new JFrame("Administrator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 1));
		
		
		String[] classNames = new String[classes.getClasses().size()];
		for (int i = 0; i < classes.getClasses().size(); i++) {
			classNames[i] = classes.getClasses().get(i).getName();
		}
		String[] teacherNames = new String[teachers.getListOfTeachers().size()];
		for (int i = 0; i < teachers.getListOfTeachers().size(); i++) {
			teacherNames[i] = teachers.getListOfTeachers().get(i).getName();
		}
		
		JComboBox<String> classList = new JComboBox<>(classNames);
		JComboBox<String> teacherList = new JComboBox<>(teacherNames);
		
		JLabel matchedList = new JLabel("Class - Teacher");
		JButton assign = new JButton("Assign Teacher");
		JButton train = new JButton("Send Teachers to Training");
		
		panel.add(teacherList);
		panel.add(classList);
		panel.add(assign);
		panel.add(matchedList);
		panel.add(train);
		
	
		frame.add(panel);
		frame.setSize(500,200);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
