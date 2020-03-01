package model;

public class Course {
	private String name;
	private Teacher teacher;

	public Course(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Teacher getTeacher() {
		return this.teacher;
	}
	
	public void setTeacher(Teacher newTeacher) {
		this.teacher = newTeacher;
	}
	
	public String toString() {
		return this.getName();
	}	
}
