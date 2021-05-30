package enviroment;

public class Gamer implements EntityBase{
	private int gamerid;
	private String firstName;
	private String lastName;
	private long nationalIdentity;
	private int birthday;
	
	public Gamer() {
		
	}

	public Gamer(int gamerid, String firstName, String lastName, long nationalIdentity, int birthday) {
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

	public long getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(long nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	

}
