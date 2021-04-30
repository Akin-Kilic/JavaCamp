package home_work2;

public class CourseManager {
    public void addCourse(Course course){
        System.out.println("Kurs eklendi"+course);
    }

    public void deleteCourse(Course course){
        System.out.println("Kurs silindi "+course);
    }

    public void completeCourse(Course course){
        System.out.println("Kurs tamamlandı "+course);

    }

}
