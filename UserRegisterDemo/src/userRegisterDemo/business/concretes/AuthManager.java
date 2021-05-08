package userRegisterDemo.business.concretes;


import java.util.List;
import java.util.regex.Pattern;

import userRegisterDemo.business.abstracts.AuthService;
import userRegisterDemo.business.abstracts.UserService;
import userRegisterDemo.entities.concretes.User;

public class AuthManager  implements AuthService{
	private List<User> users;


	public AuthManager(List<User> users) {
		super();
		this.users = users;
	}

	@Override
	public boolean isValidPassword(User user) {
		if (user.getPassword().length() >= 6) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isValidName(User user) {
		if (user.getName().length() >= 2 && user.getLastName().length() >= 2) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean isValidEmail(User user) {
		final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

		if (pattern.matcher(user.getMail()).find()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isDuplicateEmail(User user) {
		for (User user_ : users) {
			if (user_.getMail().equals(user.getMail())) {
				return false;
			}
		}
		return true;
	}

	

	}
