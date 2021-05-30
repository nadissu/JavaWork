package enviroment;

import java.rmi.RemoteException;

public class GamerManager implements GamerServices{
	AuthorServices authorServices;
	public GamerManager(AuthorServices authorServices) {
		this.authorServices=authorServices;
	}


	@Override
	public void register(Gamer gamer) throws Exception {
		if (authorServices.validate(gamer)) {
			System.out.println("Doğrulama Başarılı");
			
		}else {
			throw new Exception();
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
