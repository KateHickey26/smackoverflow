package model;

public class administrator extends Person {
    /**
     * id number will start at 200 and increase
     * means all admins can have an id starting with 2
     */
    private static int nextIDNumber = 200;
    private int idNumber;

    public administrator(String name) {
        super(name);  
        this.idNumber = nextIDNumber;
        nextIDNumber++;    
    }
    public int getIDNumber(){
        return this.idNumber;
    }
}