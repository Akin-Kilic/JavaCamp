package home_work2;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(123,"Java Kursu",30);
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course);
        System.out.println(course.getId());
        System.out.println(course.getName());
        System.out.println(course.getCourseTimeInDays());

        Instructor instructor = new Instructor(456,"Engin","Demirog","engin.demirog@gmail.com",
                "12345",course);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        System.out.println(instructor.getId());
        System.out.println(instructor.getFirstName());
        System.out.println(instructor.getLastName());
        System.out.println(instructor.getEmail());
        System.out.println(instructor.getPassword());
        System.out.println(instructor.getGivenCourse());

        Student student = new Student(789,"Akın","Kılıç","akin.kilic@gmail.com","12345",
                course);
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getEmail());
        System.out.println(student.getPassword());
        System.out.println(student.getTakenCourse());

    }
}
