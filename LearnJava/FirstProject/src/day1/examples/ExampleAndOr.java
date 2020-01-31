package day1.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		int x, y;
		x = 10;
		y = -10;
		
		/*  && = (short)and
		 *  || = (short)or
		 */
		
		
		if (x > 0 && y > 0 ) {
			System.out.println("Both numbers are postitive");
		} else if (x > 0 || y > 0) {
			System.out.println("At least one number is positive");
		} else {
			System.out.println("Both numbers are negative");
		}
		

	}

}
