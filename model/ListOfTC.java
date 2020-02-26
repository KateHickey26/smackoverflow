import java.util.ArrayList;

public class ListOfTC{
    
    protected String courseID;
    protected ArrayList<TrainingCourse> listOfTC;
    protected int numOfCourses;

    // list constructor
    // passed an int, for number of indicies?
    ListOfTC(int numOfCourses) {
        listOfTC = new ArrayList<TrainingCourse>(numOfCourses);
    }


    // adds a training course to the array list
    protected void addCourse(TrainingCourse trainingCourse){
                listOfTC.add(trainingCourse);
    }

    // removes a training course from the array list
    public void removeCourse(TrainingCourse trainingCourse){
                listOfTC.remove(trainingCourse);
    }

    // getters
    public ArrayList<TrainingCourse> getListOfTC() {
        return listOfTC;
    }

    // public String getcourseID(){
    //     return courseID;
    // }
}