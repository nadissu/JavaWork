package eTicaretDemo.business.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface UserService {
	public void add(User user);
	public void delete(User user);
	public void login(String email, String password);
	List<User>getAll();
}
