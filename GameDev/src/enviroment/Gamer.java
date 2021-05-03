package enviroment;

public class Gamer implements EntityBase{
	private int gamerid;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private String birthday;
	
	public Gamer() {
		
	}

	public Gamer(int gamerid, String firstName, String lastName, String nationalIdentity, String birthday) {
		super();
		this.gamerid = gamerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.birthday = birthday;
	}

	public int getId() {
		return gamerid;
	}

	public void setId(int id) {
		this.gamerid = id;
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

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	

}
