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
        for(int i = 0; i<listOfTC.size(); i++){
            if(listOfTC.get(i)==null){
                listOfTC.add(trainingCourse);
                //break; 
            }
        }
    }

    // removes a training course from the array list
    public void removeCourse(TrainingCourse trainingCourse){
        for(int i = 0; i< listOfTC.size(); i++) {
            if (listOfTC.get(i) == trainingCourse) {
                listOfTC.remove(i);
                //break;
            }
        }
    }

    // getters
    public ArrayList<TrainingCourse> getListOfTC() {
        return listOfTC;
    }

    // public String getcourseID(){
    //     return courseID;
    // }
}