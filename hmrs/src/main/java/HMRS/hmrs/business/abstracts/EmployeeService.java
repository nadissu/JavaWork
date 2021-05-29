package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.Employee;

public interface EmployeeService {
	DataResult<List<Employee>> getAll();
	DataResult<Employee> getById(int id);
	Result add(Employee employee);
	Result update(int id, Employee employee);
	Result delete(int id);
	Result existsEmployeeByEmailAddress(String emailAddress);
}
