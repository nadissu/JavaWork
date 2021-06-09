package  HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.VerifyCode;

public interface VerifyCodeDao extends JpaRepository<VerifyCode, Integer>{

	VerifyCode getByVerifyCode(String Code);
	boolean existsByVerifyCode(String Code);

}
