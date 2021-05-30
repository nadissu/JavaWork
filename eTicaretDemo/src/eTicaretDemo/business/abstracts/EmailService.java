package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface EmailService {
	public boolean isValidEmail(User user);
	public boolean isDuplicateEmail(User user);
}
