package eticaret.business.concretes;

import java.util.List;

import eticaret.business.abstracts.UserLoginServices;
import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entities.concretes.User;

public class UserLoginManager implements UserLoginServices{
	
	private UserDao userDao;
	private String loginEMail;
	private String loginPassword;

	public UserLoginManager(UserDao userDao, String eMail, String password) {
		super();
		this.userDao = userDao;
		this.loginEMail = eMail;
		this.loginPassword = password;
	}

	@Override
	public void login(User user) {
		if (user.geteMail() == this.loginEMail && user.getPassword() == this.loginPassword) {
			System.out.println("Giriþ baþarýlý");
		}else {
			System.out.println("Kullanýcý e-postasý veya parola hatalý girildi!");
		}
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
