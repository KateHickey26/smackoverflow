package model;

public class ClassDirector extends Person {
    private static int nextIdNumber = 100;
    private int ID;

    public ClassDirector(String name, int id) {
        super(name);
        this.ID = nextIdNumber;
        nextIdNumber++;

    }

    public int getID() {
        return ID;
    }

}
