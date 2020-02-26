package model;

import java.util.ArrayList;

// List of Classes
public class LoClasses {
	private ArrayList<Class> classes;
	
	public LoClasses() {
		this.classes = new ArrayList<Class>();
	}
	
	public ArrayList<Class> getClasses() {
		return this.classes;
	}
	
	public void add(Class c) {
		this.classes.add(c);
	}
	
	public void remove(Class c) {
		this.classes.remove(c);
	}
	
	public Class find(int id) {
		Class found = null;
		for (Class c : classes) {
			if (c.getClassID() == id) {
				found = c;
				break;
			}
		}
		return found;
	}
	
	public void print() {
		for (Class c : classes) {
			System.out.println(c);
		}
	}

}
