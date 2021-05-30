package eTicaretDemo;

import eTicaretDemo.business.concretes.AuthenticationManager;
import eTicaretDemo.entities.concretes.User;

public class Utils {

	public static void sendVerificationMail(User user) {

		System.out.println("Verification mail sent to " + user.getFirstName() + " " + user.getLastName() + "\n");
	}

	public static boolean authentication(User user, AuthenticationManager authenticationManager) {
		if (authenticationManager.isValidEmail(user) && authenticationManager.isValidName(user)
				&& authenticationManager.isValidPassword(user) && authenticationManager.isDuplicateEmail(user)) {

			return true;

		} else {
			System.out.println(user.getFirstName() + " " + user.getLastName() + ", somethings got wrong!");

			if (!authenticationManager.isValidEmail(user)) {
				System.out.println("-->  Invalid email.  <--");

			}
			if (!authenticationManager.isValidName(user)) {
				System.out
						.println("-->  Invalid name." + " Your name and surname must be at least two letters!!!  <--");

			}
			if (!authenticationManager.isValidPassword(user)) {
				System.out
						.println("-->  Invalid password." + " Your password must be at least six characters.!!!  <--");
			}
			if (!authenticationManager.isDuplicateEmail(user)) {
				System.out.println(
						"-->  There is already an account taken by this email  <--" + "  (" + user.getMail() + ")");
			}
			return false;
		}
	}

}
