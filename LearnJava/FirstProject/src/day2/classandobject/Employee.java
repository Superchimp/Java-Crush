package day2.classandobject;

public class Employee {
	
	// Encapsulation: data and methods that act on the data
	
	
	double salary;  //  <= Called Class Level Data
	double bonus;
	
	void calculateTotalPay(){
		double totalpay = salary + bonus;
		System.out.println("Total Pay = " + totalpay);
	}

}
