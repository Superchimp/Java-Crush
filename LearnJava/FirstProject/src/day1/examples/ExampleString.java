package day1.examples;

public class ExampleString {

	public static void main(String[] args) {
		
		String x = "James Dean";
		
		System.out.println("Hello " + x);
		
		// To convert string to uppercase
		System.out.println(x.toUpperCase());
		System.out.println("HELLO " + x.toUpperCase());
		
		// To slice a string
		System.out.println(x.substring(2));
		System.out.println(x.substring(1, 3));

	}

}
