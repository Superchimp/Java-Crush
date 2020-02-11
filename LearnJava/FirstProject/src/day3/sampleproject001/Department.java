package day3.sampleproject001;

public class Department {
	
	
	// Private Class data to keep with good practices
	private String deptName;
	private double budget;
	
	// You can make an Array of Objects as you would with say String or int or what have you
	// So normally you would use:
	// int[] x = new int[5];
	// Instead you use:
	private Employee[] emps = new Employee[5]; // Not sure why its set to private, probably to treat it
	                                           // like the other class variables eg deptName or budget.
	
	// Since Array is stupid and fixed and so had to have its length declared right away I need to use
	// a counter to track where I can place the next Employee as they are added.
	private int counter = 0;
	
	
	// The constructor to make a department object
	public Department(String deptName) {
		this.deptName = deptName;
		this.budget = 50000;
	}
	// This is adding an Employee object to the list called emps and uses the counter to place each Employee
	// in the correct index (I guess it would otherwise overwrite the previous Employee object otherwise)
	public void addEmployee(Employee obj) {
		emps[counter] = obj;
		counter++;
		
		// for calculating the department budget I need the Employee grade but its hidden.
		// SO make a getter for grade and make a method here to add up the department budget
		// (Can't help but feel that this should be its own method??) But follow tutorial...
		if (obj.getGrade() >= 5) {
			this.budget += 150000;
		} else {
			this.budget += 100000;
		}
	}

}
