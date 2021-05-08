package userRegisterDemo.dataAccess.abstracts;

import java.util.List;

import userRegisterDemo.entities.concretes.User;

public interface UserDao {
	public void add(User user);
	public void delete(User user);
	public void login(String email, String password);
	public List<User> getAll();

}
