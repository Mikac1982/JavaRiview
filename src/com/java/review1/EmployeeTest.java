package com.java.review1;

public class EmployeeTest {

	public static void main(String[] args) {
		
	Employee emp1=new Employee();
	emp1.setFirstName("John");
	emp1.setSsn("123456789");
	
	String last="M";
//	if (last.length()>=2) {
		emp1.setLastName(last);
//	}
	
	//String s=emp1.getInfo();
	System.out.println(emp1.getInfo());
	
	System.out.println(emp1.getFullName());
	
	System.out.println(emp1.getFirstName()+" "+emp1.getLastName());
		
	}
}
