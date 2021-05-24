package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.User;

public interface UserDao  extends JpaRepository<User,Integer> {

}
