package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface PasswordService {
	public boolean isValidPassword(User user);
}
