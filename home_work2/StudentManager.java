package home_work2;

public class StudentManager extends UserManager{

    @Override
    public void add(User user){
        System.out.println("Öğrenci eklendi: "+user.getFirstName()+" "+user.getLastName());
    }

}
