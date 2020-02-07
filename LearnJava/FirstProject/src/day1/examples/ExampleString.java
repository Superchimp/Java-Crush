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
		System.out.println(x.substring(2)); // starts from index of 2 in string till end
		System.out.println(x.substring(1, 3)); // Like a string slice in Python
		
		System.out.println("----");
		
		// Print a character at an index
		System.out.println(x.charAt(3)); // prints character at index of (3)
		
		System.out.println("----");
		
		String age = "37";
		String salary = "76543.21";
		System.out.println(age + " | " + salary); // Note the lack of "" on the console
		
		System.out.println("----");
		
		// Wrapper classes
		int a = Integer.parseInt(age); // age string value is stored as an int in variable a
		System.out.println(a); // Note that a(30) is printed the same as string age(30) no ""
		double s = Double.parseDouble(salary)/2; // Salary String value stored as double float in var s 
		System.out.println(s); // again note the difference to python "76543.21" & 76543.21
		
		//Trying to break things
		int test = Integer.parseInt(age) /2; // The answer from this is 18.5 (not a whole number)
		System.out.println("(This probably broke)");
		System.out.println("test is now: " + test); // But it truncates the number to 18 and doesn't crash
		
		

	}

}
