package userRegisterDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import userRegisterDemo.business.concretes.AuthManager;
import userRegisterDemo.dataAccess.abstracts.UserDao;
import userRegisterDemo.entities.concretes.User;



public class UserManager implements UserDao {

	private List<User> users = new ArrayList<User>();

	AuthManager authnManager = new AuthManager(users);

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
© 2021 GitHub, Inc.

