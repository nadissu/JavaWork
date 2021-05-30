package eTicaretDemo.core;

import eTicaretDemo.GoggleLogin.GoogleLoginManager;
import eTicaretDemo.entities.concretes.User;


public class GoogleLoginAdapter implements LoginService {

	@Override
	public void signUp(User user) {
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		System.out.print(user.getFirstName() + " " + user.getLastName() + " ");
		googleLoginManager.signUp(user);

	}

	@Override
	public void login(User user) {
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		System.out.print(user.getFirstName() + " " + user.getLastName() + " ");
		googleLoginManager.login(user);
	}

}
