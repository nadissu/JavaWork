package enviroment;

public class Mernis  implements AuthorServices {
	private String nationalityIdentity=("0000000000");
	private String firstName=("Nadide");
	private String lastName=("Sýðýrtmaç");
	private String birthday=("03.09.1997");

	@Override
	public boolean verify(String nationaIdentity, String firstName, String lastName, String birthday) {
		if((this.nationalityIdentity==nationaIdentity)&&(this.firstName==firstName)&&(this.lastName==lastName)&&(this.birthday==birthday)) {
			return true;
		}
		else {
			return false;
		}
	}

}
