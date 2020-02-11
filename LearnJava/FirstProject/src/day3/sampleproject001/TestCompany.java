package day3.sampleproject001;

public class TestCompany {
	
	public static void main (String[] args) {
		
		// Trigger all the Employee objects neeeded for the project
		// Note that they are all using the Employee Constructor (string, int)
		Employee alex = new Employee("Alex Rod", 6);
		Employee linda = new Employee("Linda Berry", 7);
		Employee john = new Employee("John Doe", 3);
		Employee sara = new Employee("Sara Time", 7);
		Employee james = new Employee("James Doe", 4);
		
		Department sales = new Department("XYZ Sales");
		Department iT = new Department("XYZ IT");
		
		
		sales.addEmployee(alex);
		sales.addEmployee(linda);
		sales.addEmployee(john);
		
		iT.addEmployee(sara);
		iT.addEmployee(james);
		
	}

}
