package day1.examples;

public class ExampleString {

	public static void main(String[] args) {
		
		String x = "James Dean";
		
		System.out.println("Hello " + x);
		
		System.out.println("----");
		
		// To convert string to uppercase
		System.out.println(x.toUpperCase());
		System.out.println("HELLO " + x.toUpperCase());
		
		System.out.println("----");
		
		// To slice a string
		System.out.println(x.substring(2));
		System.out.println(x.substring(1, 3));
		
		System.out.println("----");
		
		// Print a character at an index
		System.out.println(x.charAt(3));
		
		System.out.println("----");
		
		String age = "30";
		String salary = "76543.21";
		System.out.println(age + " | " + salary);
		
		System.out.println("----");
		
		// Wrapper classes
		int a = Integer.parseInt(age);
		System.out.println(a); // Note that a(30) is printed the same as string age(30) no ""
		double s = Double.parseDouble(salary)/2;
		System.out.println(s);
		
		

	}

}
