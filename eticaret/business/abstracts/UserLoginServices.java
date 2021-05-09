package eticaret.business.abstracts;

import java.util.List;

import eticaret.entities.concretes.User;

public interface UserLoginServices {
	void login(User user);
	User get(int id);
	List<User> getAll();
}
