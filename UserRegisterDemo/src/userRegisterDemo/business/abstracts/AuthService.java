package userRegisterDemo.business.abstracts;

import userRegisterDemo.entities.concretes.User;

public interface AuthService {
	public boolean isValidPassword(User user);
	public boolean isValidName(User user);
	public boolean isValidEmail(User user);
	public boolean isDuplicateEmail(User user);
	
	

}
