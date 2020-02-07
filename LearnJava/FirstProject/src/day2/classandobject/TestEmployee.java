package day2.classandobject;

public class TestEmployee {

	public static void main(String[] args) {
		
		/*
		 * Employee alex, linda, john;
		 * 
		 * alex = new Employee();     You can do it this way
		 * linda = new Employee();    or the version below
		 * john = new Employee();             |
		 *                                   \ /
		 *                                    V
		 */
		
		Employee alex = new Employee();
		Employee linda = new Employee();
		Employee john = new Employee();
		
		alex.salary = 90000;
		alex.bonus = 20000;
		alex.calculateTotalPay();
		
		linda.salary = 100000.78;
		linda.bonus = 23456.89;
		linda.calculateTotalPay();
		
		//john.salary = ;
		
		


		

	}

}
