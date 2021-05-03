package concrete;

import Entities.Customer;
import interfaces.CustomerService;
import interfaces.ValidationService;

public class CustomerManager implements CustomerService {
	
	ValidationService validationService;
	
	

	public CustomerManager(ValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void add(Customer customer) {
		if(validationService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirsName()+" isimli m��teri eklendi.");
		}else {
			System.out.println("M��teri bilgileri ge�ersiz!");
		}
		
	}

	@Override
	public void update(Customer customer) {
		if(validationService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirsName()+" isimli m��teri g�ncellendi.");
		}else {
			System.out.println("M��teri g�ncelleme ba�ar�s�z!");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		if(validationService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirsName()+" isimli m��teri silindi.");
		}else {
			System.out.println("M��teri silme ba�ar�s�z!");
		}
		
	}
	

}
