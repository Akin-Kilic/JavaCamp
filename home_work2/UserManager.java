package home_work2;

public abstract class UserManager {

    public void add(User user){
        System.out.println("Kullanıcı Oluşturuldu: "+user.getFirstName()+" "+user.getLastName());
    }
}
