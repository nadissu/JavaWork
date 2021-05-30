package eTicaretDemo.core;

import eTicaretDemo.entities.concretes.User;

public interface LoginService {
	public void signUp(User user);
	public void login(User user);
}
