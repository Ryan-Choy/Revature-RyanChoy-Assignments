

public class MainConstruct {
	
	public static void main(String[] args) {

				
		//example
		//aid street name, city, state, zip
		Address pra = new Address(1001, "Walnut", "Los Vegas", "NV", 123658);
		// id, name, client name
		Project emp = new Project(153, "Math E-book", "Justin");
		Employee e1 = new Employee(101, "Ryan", 27, "ryandchoy@gmail.com", pra, emp);
		System.out.println(e1);
		
		//Permanent address
		Address per = new Address(1234, "Thomas", "Los Angelas","CA", 54789);
		System.out.println("The permanent address is"+ per);
		
	}

}
