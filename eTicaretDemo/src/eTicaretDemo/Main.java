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
		
		User user1 = new User("Nadide", "Sýðýrtmaç", "nadide@gmail.com", "nadide123");
		userDao.add(user1);
		userDao.login("nadide@gmail.com", "nadide123");
		
		User user2 = new User("Büþra", "Sýðýrtmaç", "busra@gmail.com", "busra4788");
		userDao.add(user2);
		userDao.login("busra@gmail.com", "busra4788");
		
		User user3 = new User("Perihan", "huhu", "huhu@gmail.com", "huhu1212");
		userDao.add(user3);
		userDao.login("huhu@gmail.com", "huhu1212");
		
		User user4 = new User("Snake", "Sjsjsj", "snake@gmail.com", "snakesnake");
		userDao.add(user4);
		userDao.login("snake@gmail.com", "snakesnake");//wrong login sample
		
		User user5 = new User("D", "S", "text@gmail.cm", "12345");//wrong name, surname, email & password sample
		userDao.add(user5);													//not listed in the user list
		
		User user6 = new User("Sultan", "Sýðýrtmaç", "sultan@gmail.com", "sultan11"); //google sign up & login sample
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
