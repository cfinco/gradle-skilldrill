package edu.isu.cs.cs2263;

import java.util.LinkedList;

public class Student {
    public String firstName;
    public String lastName;
    public LinkedList<Course> courses;

    public Student(String fName, String lName){
        setFirstName(fName);
        setLastName(lName);
        courses = new LinkedList<Course>();
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}
