package day1.examples;

public class ExampleFor {

	public static void main(String[] args) {
		// (initial value; condition; increment/decrement) 
		for (int i = 0; i <= 4; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("-----");
		for (int i = 4; i >= 0; i--) {
			System.out.println("i = " + i);
		}
		System.out.println("-----");
		for (int i = 8; i >= 0; i -= 2) {
			System.out.println("i = " + i);
		}

	}

}
