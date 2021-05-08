package userRegisterDemo.business.abstracts;


import java.util.List;

import userRegisterDemo.entities.concretes.User;

public interface UserService {	
	public void add(User user);
	public void delete(User user);
	public void login(String email, String password);
	List<User>getAll();
}
