import java.util.ArrayList;
import java.util.HashMap;

public class match {
    static ArrayList<String> requirements;
    static HashMap<String, String> teachers;

    public static void testCase() {
        teachers = new HashMap<String, String>();
        teachers.put("CompSci", "Mark");
        teachers.put("English", "Chris");
        teachers.put("Math", "Kate");

        requirements = new ArrayList<String>();
        requirements.add("Math");
        requirements.add("English");
        requirements.add("CompSci");
    }

    public static void fillRequirements() {
        for (int i = 0; i < requirements.size(); i++) {
                System.out.println(teachers.get(requirements.get(i)));
                // add request for staff member to required role
        }
    }

    public static void main(String[] args) {
        testCase();
        fillRequirements();
    }

    
}