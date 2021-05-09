package eticaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi: "+user.getFirstName());
		users.add(user);	
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(this.users.indexOf(user));
		System.out.println("Hibernate ile silindi: "+user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return users.get(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
