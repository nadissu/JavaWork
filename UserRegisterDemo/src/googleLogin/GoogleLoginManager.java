package googleLogin;

public class GoogleLoginManager implements GoogleLoginService{

	@Override
	public boolean checkUserByGoogle() {
		System.out.println("Google Kullanýcý Bilgileri ile Giriþ Ýþlemi Tamamlandý");
		return true;
	}

	

}
