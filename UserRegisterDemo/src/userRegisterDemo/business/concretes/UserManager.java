package userRegisterDemo.business.concretes;




import userRegisterDemo.business.abstracts.UserService;
import userRegisterDemo.dataAccess.abstracts.UserDao;
import userRegisterDemo.entities.concretes.User;

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
	public void login(String mail, String password) {
		userDao.login(mail, password);

	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
