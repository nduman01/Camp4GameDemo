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
			System.out.println(customer.getFirsName()+" isimli müþteri eklendi.");
		}else {
			System.out.println("Müþteri bilgileri geçersiz!");
		}
		
	}

	@Override
	public void update(Customer customer) {
		if(validationService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirsName()+" isimli müþteri güncellendi.");
		}else {
			System.out.println("Müþteri güncelleme baþarýsýz!");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		if(validationService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirsName()+" isimli müþteri silindi.");
		}else {
			System.out.println("Müþteri silme baþarýsýz!");
		}
		
	}
	

}
