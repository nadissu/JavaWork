import abstracts.BaseCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new BaseCustomerManager();
		customerManager.save(new Customer(1, "Nadide", "Sığırtmaç", 1234567891,1997));
		
	}

}
