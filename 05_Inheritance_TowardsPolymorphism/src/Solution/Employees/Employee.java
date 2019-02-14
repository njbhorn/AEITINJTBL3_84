package Solution.Employees;

public class Employee {
	
	private int id;
	private String name;
	private String jobTitle;
	
	protected static int idCount;

	public Employee(String name, String jobTitle) {
		generateId();
		setName(name);
		setJobTitle(jobTitle);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	private void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	private void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void generateId() {
		setId(++Employee.idCount * 10);
	}

	public void showInfo() {
		System.out.println("\n**** *****");

		System.out.printf("Name: %s\n", getName());
		System.out.printf("Job Title: %s\n", getJobTitle());
		System.out.printf("Employee ID: %d\n", getId());
	}
}
