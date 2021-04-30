package home_work2;

public class Student extends User{

    private Course takenCourse;

    public Student(){

    }

    public Student(int id, String firstName, String lastName, String email, String password, Course takenCourse) {
        super(id, firstName, lastName, email, password);
        this.takenCourse = takenCourse;
    }

    public String getTakenCourse() {
        return takenCourse.getName();
    }

    public void setTakenCourse(Course course) {
        takenCourse = course;
    }


}
