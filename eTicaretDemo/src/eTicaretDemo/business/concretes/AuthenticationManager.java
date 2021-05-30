package eTicaretDemo.business.concretes;

import java.util.List;
import java.util.regex.Pattern;
import eTicaretDemo.business.abstracts.EmailService;
import eTicaretDemo.business.abstracts.NameService;
import eTicaretDemo.business.abstracts.PasswordService;
import eTicaretDemo.entities.concretes.User;

public class AuthenticationManager implements EmailService, NameService, PasswordService {

	private List<User> users;

	public AuthenticationManager(List<User> users) {
		this.users = users;
	}

	@Override
	public boolean isValidPassword(User user) {
		// min 6 characters

		if (user.getPassword().length() >= 6) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isValidName(User user) {
		// min 2 characters first name-last name
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isValidEmail(User user) {
		// regex & unique

		final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

		if (pattern.matcher(user.getMail()).find()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isDuplicateEmail(User user) {

		for (User user_ : users) {
			if (user_.getMail().equals(user.getMail())) {
				return false;
			}
		}
		return true;
	}
}
