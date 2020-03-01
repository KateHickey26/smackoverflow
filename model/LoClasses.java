package model;

import java.util.ArrayList;

// List of Classes
public class LoClasses {
	private ArrayList<Course> classes;
	
	public LoClasses() {
		this.classes = new ArrayList<Course>();
	}
	
	public ArrayList<Course> getClasses() {
		return this.classes;
	}
	
	public void add(Course c) {
		this.classes.add(c);
	}
	
	public void remove(Course c) {
		this.classes.remove(c);
	}
	
	public Course find(String courseName) {
		for (Course c : classes) {
			if (c.getName().equals(courseName)) {
				return c;
			}
		}
		return null;
	}
	
	public void print() {
		for (Course c : classes) {
			System.out.println(c);
		}
	}

}
