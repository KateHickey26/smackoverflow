package Person;

import java.util.ArrayList;
public class ClassDirector extends Person {

    private static ArrayList<Object> CourseList = new ArrayList<>();
    private int ID;

    public ClassDirector(String name, int id) {
        super(name);
        this.ID = id;

    }

    public void addCourse(Object Courses) {

        CourseList.add(Courses);


    }

    public void setID(int newValue) { ID = newValue; }

    public double getID() { return ID; }

}
