package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import HMRS.hmrs.entities.concretes.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	boolean existsEmployeeByEmailAddress(String emailAddress);
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> parent of 1292c57 (Validators,Son Ödev İsterler Eklendi,Ufak bir hata var)
=======
>>>>>>> parent of 1292c57 (Validators,Son Ödev İsterler Eklendi,Ufak bir hata var)
}
