package model;

import java.util.ArrayList;

public class LoTeachers {
    private ArrayList<Teacher> listOfTeachers;

    public LoTeachers(){
        this.listOfTeachers = new ArrayList<>();
    }

    public ArrayList<Teacher> getListOfTeachers(){
        return this.listOfTeachers;
    }

    public void addTeacher(Teacher teacher){
        listOfTeachers.add(teacher);
    }
}