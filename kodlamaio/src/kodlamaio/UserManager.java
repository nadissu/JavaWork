package kodlamaio;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
	}
	public void addMultiple (User[] users) {
		for (User user : users) {
			add(user);
		}


}
}
