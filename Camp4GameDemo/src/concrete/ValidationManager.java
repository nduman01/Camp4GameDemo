package concrete;

import Entities.Customer;
import interfaces.ValidationService;

public class ValidationManager implements ValidationService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
			
			if(customer.getBirthYear()>1921 
					&& !customer.getFirsName().isEmpty() 
					&& !customer.getLastName().isEmpty()
					&& customer.getNationalId().length()==11) {
				System.out.println("Doðrulama baþarýlý.");
				return true;
			}else {
				System.out.println("Doðrulama baþarýsýz!");
				return false;
			}
		}
}
