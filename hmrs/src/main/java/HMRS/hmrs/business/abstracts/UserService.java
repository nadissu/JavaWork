package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.entities.concretes.JobTitle;

public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);
	Result update(int id, User user);
	Result delete(int id);

}
