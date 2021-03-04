
public class Employee {

	private int id;
	private String name;
	private int age;
	private String email;
	private Address presentAddress;
	private Project employeeProject;

	public Employee(int id, String name, int age, String email, Address presentAddress, Project employeeProject) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.presentAddress = presentAddress;
		this.employeeProject = employeeProject;
	}

	@Override
	public String toString() {
		return "Employee - [id: " + id + ", name: " + name + ", age: " + age + ", email: " + email + "]\nCurrent Address is: " 
				+ presentAddress + employeeProject;
	}

}
//Assignment
//Create Employee class with id,name,age,email
//and Project(projectid,projectname,clientname)
//and present and permanent Address(aid,streetname,city,state,zip)