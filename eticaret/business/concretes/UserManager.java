package eticaret.business.concretes;

import java.util.List;

import eticaret.adapters.concretes.EMailValidatorManager;
import eticaret.business.abstracts.UserService;
import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private EMailValidatorManager eMailValidatorManager;

	public UserManager(UserDao userDao, EMailValidatorManager eMailValidatorManager) {
		super();
		this.userDao = userDao;
		this.eMailValidatorManager = eMailValidatorManager;
	}

	@Override
	public void add(User user) {
		for(User control : userDao.getAll()) {
			if (control.geteMail() == user.geteMail()) {
				System.out.println("Bu e-posta sistemde mevcut!");
				return;
			}
		}
		if (user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Ýsim ve soyisim 2 karakterden kýsa olamaz!");
			return;
		}
		if (user.getPassword().length() <6) {
			System.out.println("Parola 6 karakterden kýsa olamaz!");
			return;
		}if (!eMailValidatorManager.isEMailValid(user.geteMail())) {
			System.out.println("Geçersiz e-posta!");
			return;
		}
		userDao.add(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}
}
