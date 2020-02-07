package day1.exercises;

public class ExerciseA {
	public static void main (String[] arg) {
		
		double salary = 20000;
		double tax = 0.0;
		
		// Not how tax calculations really work but nevermind...
		if (salary <= 15000) {
			tax = (salary / 100) * 10; 
		} else if (salary <= 40000) {
			tax = (salary / 100) * 20;
		} else {
			tax = (salary / 100) * 30;
		}
		System.out.println("Tax = " + tax);
		
	}

}
