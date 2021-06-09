package HMRS.hmrs.business.abstracts;

import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.User;


public interface VerifyCodeService {

	String createVerifyCode(User user);
	void sendMail(String mail);
	Result verifyUser(String code); 
		
}
