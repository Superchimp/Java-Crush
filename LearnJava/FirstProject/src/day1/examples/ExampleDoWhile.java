package day1.examples;

public class ExampleDoWhile {
	public static void main (String[] args) {
		
		int x = 10;
		
		do {
			System.out.println("X = " + x);
			x -= 2;
		} while(x >= 0);
		
		System.out.println("----t.");
		
		do {
			System.out.println("X = " + x);
			x += 2;
		} while (x > 10);
	}

}
