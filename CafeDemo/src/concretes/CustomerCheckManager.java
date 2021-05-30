package concretes;

import abstracts.CustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}
	

}
