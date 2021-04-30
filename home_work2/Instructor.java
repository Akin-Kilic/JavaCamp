package home_work2;

public class Instructor extends User{
    private Course givenCourse;

    public Instructor(){

    }

    public Instructor(int id, String firstName, String lastName, String email, String password, Course givenCourse) {
        super(id, firstName, lastName, email, password);
        this.givenCourse = givenCourse;
    }

    public String getGivenCourse() {
        return givenCourse.getName();
    }

    public void setGivenCourse(Course course) {
        this.givenCourse = course;
    }
}
