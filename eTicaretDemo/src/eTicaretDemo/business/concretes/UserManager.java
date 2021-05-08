package eTicaretDemo.business.concretes;

import java.util.List;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void delete(User user) {
		// delete from list

	}

	@Override
	public void login(String email, String password) {
		userDao.login(email, password);

	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
