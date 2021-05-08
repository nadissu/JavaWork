package eTicaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.Utils;
import eTicaretDemo.business.concretes.AuthenticationManager;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManagerDao implements UserDao {

	private List<User> users = new ArrayList<User>();

	AuthenticationManager authenticationManager = new AuthenticationManager(users);

	@Override
	public void add(User user) {
		// all authentication things
		if (Utils.authentication(user, authenticationManager)) {

			if (!authenticationManager.isDuplicateEmail(user)) {
				System.out.println("-->  There is already an account taken by this email  <--");
				delete(user);

			} else {
				System.out.println(user.getFirstName() + " is valid user. Account created.");
				users.add(user);
				Utils.sendVerificationMail(user);
			}

		} else {
			System.out.println("Check your informations again.\n\n");
		}
	}

	@Override
	public void delete(User user) {

		// ----------------------------delete from list

		System.out.println("User \"" + user.getFirstName() + "\" is deleted.");

	}

	@Override
	public void login(String email, String password) {

		for (User user_ : users) {
			if (user_.getMail().equals(email) && user_.getPassword() == password) {
				System.out.println("Welcome back " + user_.getFirstName() + " " + user_.getLastName()
						+ ". You logged in successfully.\n\n");
				return;
			}
		}
		System.out.println("You entered wrong information! There is no account like that. Try again.\n\n");

	}

	@Override
	public List<User> getAll() {
		return users;
	}

}