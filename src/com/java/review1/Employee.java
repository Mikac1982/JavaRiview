package com.java.review1;

public class Employee {

	private String ssn;
	private String firstName;
	private String lastName;
	private int age;
	
    public Employee() {
		
	}
    
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		if(ssn.length()!=9)
			return;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName.length()<3) 
			return;
		this.firstName = firstName;
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFullName() {
	//	return firstName+" "+lastName;
		return firstName+", "+lastName;
		
	}
	
	
	
	
	public String getInfo() {
		return "firstName="+firstName+" lastName="+this.lastName+" age="+age+" snn="+ssn;
	}
	
	
}
