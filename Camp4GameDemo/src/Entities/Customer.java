package Entities;

public class Customer {
	int id;
	String firsName;
	String lastName;
	String nationalId;
	int birthYear;
	public Customer(int id, String firsName, String lastName, String nationalId, int birthYear) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthYear = birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	

}
