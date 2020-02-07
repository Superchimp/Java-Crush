package day2.oop.datahiding;

public class TestEmployee {

	public static void main(String[] args) {
		// Encapsulation
		// Data Hiding: is not hiding your data but protecting your data from outside manipulations
		// It is a way of preventing access to a variable outside of it's own class
		
		Employee alex = new Employee();
		
		//No access to salary below from this class
		//alex.salary(9999999999);  This wont work because salary is set to private in its class
		alex.setSalary(100000);
		//alex.bonus = 20000;    This wont work now that bonus is set to private
		alex.setBonus(20000); // So use the setBonus method to access the private variable in Employee class
		alex.calculateTotalPay();
		
		//System.out.println(alex.salary);  <= No access to salary variable from this class, it's private
		System.out.println(alex.getSalary());

	}

}
