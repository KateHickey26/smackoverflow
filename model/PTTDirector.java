package Person;

import java.util.ArrayList;

public class PTTDirector extends Person {

    private int ID;

    private static ArrayList<Object> QualifiedMath = new ArrayList<>();
    private static ArrayList<Object> QualifiedEnglish = new ArrayList<>();
    private static ArrayList<Object> QualifiedHistory = new ArrayList<>();

    private static ArrayList<Object> TrainingMath = new ArrayList<>();
    private static ArrayList<Object> TrainingEnglish = new ArrayList<>();
    private static ArrayList<Object> TrainingHistory = new ArrayList<>();

    public PTTDirector(String name, int id) {

        super(name);
        this.ID = id;

    }

    public void approveMaths(Object Teacher, boolean approved) {
        if (approved = true) {
            QualifiedMath.add(Teacher);

        }

        else {

            TrainingMath.add(Teacher);

        }

    }

    public void approveEnglish(Object Teacher, boolean approved) {
        if (approved = true) {
            QualifiedEnglish.add(Teacher);

        }

        else {

            TrainingEnglish.add(Teacher);

        }
    }

    public void approveHistory(Object Teacher, boolean approved) {
        if (approved = true) {
            QualifiedHistory.add(Teacher);

        }

        else {

            TrainingHistory.add(Teacher);

        }
    }
}
