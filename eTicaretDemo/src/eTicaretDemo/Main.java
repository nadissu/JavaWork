package eTicaretDemo;

import eTicaretDemo.core.GoogleLoginAdapter;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.dataAccess.concretes.UserManagerDao;
import eTicaretDemo.entities.concretes.User;

public class Main {
/*
 * 	Learning and practice for layered coding 
 * 		Week5
 * 			packaging -business, dataAccess, entities, core-
 * 				interface, static utils, adapters
 * 
 * */
	public static void main(String[] args) {
		
		UserDao userDao = new UserManagerDao();
		GoogleLoginAdapter googleLoginAdapter = new GoogleLoginAdapter();
		
		User user1 = new User("Emre", "Tekin", "emretekin@gmail.com", "emre123");
		userDao.add(user1);
		userDao.login("emretekin@gmail.com", "emre123");
		
		User user2 = new User("Eden", "Hazard", "edenhazard@gmail.com", "edenhazard10");
		userDao.add(user2);
		userDao.login("edenhazard@gmail.com", "edenhazard10");
		
		User user3 = new User("James", "Hetfield", "metallica@gmail.com", "metaljames");
		userDao.add(user3);
		userDao.login("metallica@gmail.com", "metaljames");
		
		User user4 = new User("Dave", "Mustaine", "megadeth@gmail.com", "megadave");
		userDao.add(user4);
		userDao.login("megath@gmail.com", "megdave");//wrong login sample
		
		User user5 = new User("A", "B", "wrognformat@gmail.cm", "12345");//wrong name, surname, email & password sample
		userDao.add(user5);													//not listed in the user list
		
		User user6 = new User("Ngolo", "Kante", "chelsea@gmail.com", "kante7"); //google sign up & login sample
		googleLoginAdapter.signUp(user6);
		userDao.add(user6);
		googleLoginAdapter.login(user6);

		System.out.println("\n\n-------------------USERS-------------------");
		int count = 1;
		for(User user : userDao.getAll()){
			System.out.println("   " + count + " " + user.getFirstName() + " " + user.getLastName() + " (" + user.getMail() + ")");
			count++;
		}
		
		

	}

}
