import java.util.ArrayList;

public class TrainingCourse {
    
    private String courseID;
    private String courseName;
    private ArrayList<Teacher> ListOfTeachers;

    // constructor
    protected TrainingCourse(String name, String ID){
        ID = courseID;
        name = courseName;
        ListOfTeachers = new ArrayList<Teacher>;
    }

    // getters
    public String getcourseID(){
        return courseID;
    }

    public String getcourseName(){
        return courseName;
    }

    public ArrayList<Teacher> getListOfTeachers(){
        return ListOfTeachers;
    }
}