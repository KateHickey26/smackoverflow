package model;

import java.util.ArrayList;

public class Teacher extends Person{
    /**
     * id number will start at 500 and increase
     * means all admins can have an id starting with 5
     */
    private static int nextIDNumber = 500;
    private String name;
    private ArrayList<TrainingCourse> coursesTrainedFor;
    private int iDNumber;

    public Teacher(String name){
        super(name);
        /**
         * list of training course the teacher has done
         * dont know if this is necessary
         */
        this.coursesTrainedFor = new ArrayList<TrainingCourse>();
        iDNumber = nextIDNumber;
        nextIDNumber++;
    }

    public int getIDNumber(){
        return this.iDNumber;
    }

    public ArrayList<TrainingCourse> getCoursesTrainedFor() {
        return this.coursesTrainedFor;
    }

    public void addCourseTrainedFor(TrainingCourse tc) {
        this.coursesTrainedFor.add(tc);
    }


}