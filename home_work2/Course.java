package home_work2;

public class Course {
    private int id;
    private String name;
    private int courseTimeInDays;

    public Course(){

    }

    public Course(int id, String name, int courseTimeInDays) {
        this.id = id;
        this.name = name;
        this.courseTimeInDays = courseTimeInDays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseTimeInDays() {
        return courseTimeInDays;
    }

    public void setCourseTimeInDays(int courseTimeInDays) {
        this.courseTimeInDays = courseTimeInDays;
    }
}
