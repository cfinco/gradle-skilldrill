package edu.isu.cs.cs2263;

public class Course {
    public int number;
    public String subject;
    public String title;

    public Course(int num, String subj, String t){
        setNumber(num);
        setSubject(subj);
        setTitle(t);
    }

    public void setNumber(int num){
        this.number = num;
    }

    public int getNumber(){
        return number;
    }

    public void setSubject(String subj){
        this.subject = subj;
    }

    public String getSubject(){
        return subject;
    }

    public void setTitle(String t){
        this.title = t;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return subject + " " + number + " " + title;
    }
}
