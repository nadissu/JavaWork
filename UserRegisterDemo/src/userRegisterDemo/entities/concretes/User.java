package userRegisterDemo.entities.concretes;

import userRegisterDemo.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String name;
	private String lastName;
	private String mail;
	private String password;
	
	public User() {
		
	}
	
	public User(int id, String name, String lastName, String mail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
