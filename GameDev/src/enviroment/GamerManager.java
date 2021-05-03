package enviroment;

public class GamerManager implements GamerServices{
	AuthorServices authorServices;
	public GamerManager(AuthorServices authorServices) {
		this.authorServices=authorServices;
	}


	@Override
	public void register(Gamer gamer) {
		if (authorServices.verify(gamer.getNationalIdentity(),gamer.getFirstName(),gamer.getLastName(),gamer.getBirthday())) 
		{
			System.out.println("Giriş Başarılı");
			
		} else {
			System.out.println("Kullanıcı doğrulanmadığı için eklenmedi...");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+":isimindeki Kullanıcı Başarı ile Güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+":isimindeki Kullanıcı Başarı bir şekilde silindi");
		
	}

}
