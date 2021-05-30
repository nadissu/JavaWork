package kodlamaio;

public class User {
	private int id;
	private String email;
	private String password;
	private String userName;
	private String firstName;
	private String lastName;
	
	public User () {
		
	}
	public User(int id,String email,String password,String userName,String firstName, String lastName) {
		this.id=id;
		this.email=email;
		this.password=password;
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
