package day2.classandobject;

public class Employee {
	
	double salary;
	double bonus;
	
	void calculateTotalPay(){
		double totalpay = salary + bonus;
		System.out.println("Total Pay = " + totalpay);
	}

}
