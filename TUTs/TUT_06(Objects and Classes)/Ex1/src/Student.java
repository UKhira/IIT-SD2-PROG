/*
 * Create a new class called 'Student'
*/

import java.util.ArrayList;

public class Student {
    
    /*
     * Add the private attributes to the class:
    */
    private String name;
    private String id;
    private ArrayList <Module> module;
    /*
     * Add a constructor to class that creates a new student given a name and an ID:
    */
    public Student(String name, String id){
        this.name = name;
        this.id = id;
        this.module = new ArrayList<>();
    }

    /*
     * Add a public method in Student class to get the name of the student
     */
    public String getName(){
        return this.name;
    }

    public String getID(){
        return this.id;
    }  

    // public void addModule(){
    //     this.module.add();
    // }
}
