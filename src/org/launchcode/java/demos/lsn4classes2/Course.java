package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }

    public void setInstructor(Teacher instructor){
        this.instructor = instructor;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents){
        this.enrolledStudents = enrolledStudents;
    }

    public String getTopic(){
        return topic;
    }

    public Teacher getInstructor(){
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents(){
        return this.enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    public String toString() {
        String courseReport = String.format("The topic is %s Instructor is %s Students Enrolled are %s", this.topic, this.instructor, this.enrolledStudents);
        return courseReport;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        Course course = (Course) toBeCompared;
        if(!topic.equals(course.topic)) {
            return false;
        }
        if(!instructor.equals(course.instructor)){
            return false;
        }
        return enrolledStudents.equals(course.enrolledStudents);
    }

}
