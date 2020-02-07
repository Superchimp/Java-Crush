package day2.oop.datahiding;

public class Employee {
	
	// As a general rule values in a class should be private and all classes should have a
	// getter and setter methods to access the data 
	// It's also usually good to have your methods set to public
	
	private double salary; // private means its only accessible/visible from this class
	private double bonus; // Right Click - Source - Generate Getters and Setters (Eclipse feature)
	// this results in lines 11 to 17 
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setSalary(double salary) { // public means its visible in entire project
		
		if(salary >= 40000 && salary <= 200000) {
			this.salary = salary;
		} else {
			this.salary = 0;
			System.out.println("Please Check Salary");
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void calculateTotalPay() {
		double totalPay = salary + bonus;
		System.out.println("Total Pay = " + totalPay);
	}

}
