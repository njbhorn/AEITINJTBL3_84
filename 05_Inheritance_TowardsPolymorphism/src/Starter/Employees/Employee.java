package Starter.Employees;

public class Employee {
	private String name;	
	private String jobTitle;	
	private int id;


	public Employee(String name, String jobTitle ) {

		
	}
	
	protected static int idCount;
	public void generateId() {

	}
	

	
	public void showInfo() {
		System.out.println("\n**** *****");
		
		System.out.printf("Name: %s\n", "dummmy");
        System.out.printf("Job Title: %s\n", "dummy");
        System.out.printf("Employee ID: %d\n", 0);		
	}
}
