package home_work2;

public class InstructorManager extends UserManager{

    @Override
    public void add(User user){
        System.out.println("Eğitmen eklendi: "+user.getFirstName()+" "+user.getLastName());
    }
}
