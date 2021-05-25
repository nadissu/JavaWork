package  HMRS.hmrs.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.EmployeeService;
import HMRS.hmrs.core.utilities.DataResult;
import HMRS.hmrs.core.utilities.ErrorDataResult;
import HMRS.hmrs.core.utilities.ErrorResult;
import HMRS.hmrs.core.utilities.Result;
import HMRS.hmrs.core.utilities.SuccessDataResult;
import HMRS.hmrs.core.utilities.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.EmployeeDao;
import HMRS.hmrs.entities.concretes.Employee;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class EmployeeManager implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	Employee employeeDb = new Employee();
	

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>("Employee are Listed", this.employeeDao.findAll());
	}
	
	@Override
	public DataResult<Employee> getById(int id) {
		if (this.employeeDao.findById(id).orElse(null) != null ) {
			return new SuccessDataResult<Employee>("Belirtilen sistem çalışanı başarıyla bulundu.", this.employeeDao.findById(id).get());
		} else {
			return new ErrorDataResult<Employee>("Belirtilen sistem çalışanı mevcut değildir.");
		}
	}

	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("User is Added");
	}

	@Override
	public Result update(int id, Employee employee) {
		if(employeeDao.getOne(id) == null) {
			return new ErrorResult("User Does not Exist");
		}	
		employeeDao.save(employee);
		
		return new SuccessResult("Employee is Updated");
	}
	
	@Override
	public Result delete(int id) {
		if(employeeDb == null) {
			return new ErrorResult("Id of Employee is Null");
		}
		employeeDao.deleteById(id);

		return new SuccessResult("Employee is Deleted");
	}
	
	@Override
	public Result existsEmployeeByEmailAddress(String emailAddress) {
		if (this.employeeDao.existsEmployeeByEmailAddress(emailAddress)) {
			return new SuccessResult("Bu email'e sahip bir sistem çalışanı vardır: " + emailAddress);
		} else {
			return new ErrorResult("Bu email'e sahip bir sistem çalışanı vardır." + emailAddress);
		}
	}

}