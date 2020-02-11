package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c, d, e;
		c = 30; // can use one or...
		d = 40; e = 50; // can have multiple on one line
		
		int[] x = {10, 20, 30, 40, 50};
		
		System.out.println(x[2] + " " + x[4]);
		
		//Enchanced for statement or Enhanced For Loop
		for(int temp1 : x) {
			System.out.println(temp1);
		}
		System.out.println("-------");
		
		int[] y = new int[5]; // Make an Array of index 0 to 4 (5 slots) all = 0
		
		y[1] = 1; // Simple way to add value to an index
		y[2] = 2;
		
		for(int temp2 : y) {
			System.out.println(temp2); // Note that empty values print as 0
		}
		
		String[] z = new String[4]; // Make array of index 0 to 3 (4 slots) all = Null
		
		z[1] = "One";  // Simply add String values to target index
		z[3] = "Four";
		
		System.out.println(z); // This wont print the array/list like Python would
		
		for(String s : z) {
			System.out.println(s); // Note that empty values are printed as Null
		}
	}

}
