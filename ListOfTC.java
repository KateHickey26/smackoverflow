//import java.rmi.registry.LocateRegistry;

public class ListOfTC{
    
    protected String courseID;
    protected ArrayList<TrainingCourse> ListOfTC;
    protected int numOfCourses;

    // list constructor
    // passed an int, for number of indicies?
    listOfTC(int numOfCourses){
        listofTC = new ArrayList<TrainingCourse>(numOfCourses);
    }


    // adds a training course to the array list
    protected void addCourse(TrainingCourse trainingCourse){
        for(int i = 0; i<ListOfTC.size(); i++){
            if(ListOfTC[i]==null){
                listOfTC[i] = trainingCourse;
                break;
            }
        }
    }

    // removes a training course from the array list
    public void removeCourse(TrainingCourse trainingCourse){
        for(int i = 0; i<listOfTC.size(); i++){
            if(listOfTC[i]==trainingCourse){
                listOfTC[i]= null;
                break;
            }
        }
    }

    // getters
    public <String> getListOfTC(){
        return ListOfTC;
    }

    public String getcourseID(){
        return courseID;
    }
}