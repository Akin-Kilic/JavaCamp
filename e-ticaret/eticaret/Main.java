package eticaret;

import eticaret.adapters.concretes.EMailValidatorManager;
import eticaret.business.abstracts.UserLoginServices;
import eticaret.business.abstracts.UserService;
import eticaret.business.concretes.UserLoginManager;
import eticaret.business.concretes.UserManager;
import eticaret.dataAccess.concretes.HibernateUserDao;
import eticaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao(), new EMailValidatorManager());
		
		User user = new User(1, "akýn", "kýlýç", "akin602000@gmail.com", "123456");
		userService.add(user);
		User user2 = new User(2, "muharrem", "candan", "muharrem@gmail.com", "123456");
		userService.add(user2);
		User user3 = new User(3, "ali", "kerem", "ali@gmail.com", "124578");
		userService.add(user3);
		User user4 = new User(4, "ayþe", "toy", "muharrem@gmail.com", "325698");
		userService.add(user4);
		
		UserLoginServices userLoginServices = new UserLoginManager(new HibernateUserDao(), "muharrem@gmail.com", "123456");
		userLoginServices.login(user2);
		
	}
}