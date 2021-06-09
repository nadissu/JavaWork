package  HMRS.hmrs.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import HMRS.hmrs.entities.concretes.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	boolean existsByMail(String mail);
	
}
