
public class Class {
	private int classID;
	private String name;
	private Teacher teacher;

	public Class(int id, String name, Teacher teacher) {
		this.classID = id;
		this.teacher = teacher;
		this.name = name;
	}
	
	public int getClassID() {
		return this.classID;
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
