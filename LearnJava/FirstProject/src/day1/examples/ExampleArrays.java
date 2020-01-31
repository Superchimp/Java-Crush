package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c, d, e;
		c = 30; 
		d = 40; e = 50;
		
		int[] x = {10, 20, 30, 40, 50};
		
		System.out.println(x[2] + " " + x[4]);
		
		for(int temp1 : x) {
			System.out.println(temp1);
		}
		System.out.println("-------");
		
		int[] y = new int[5];
		
		y[1] = 1;
		y[2] = 2;
		
		for(int temp2 : y) {
			System.out.println(temp2);
		}
		
		String[] z = new String[4];
		
		z[1] = "One";
		z[3] = "Four";
		
		System.out.println(z);
		for(String s : z) {
			System.out.println(s);
		}
	}

}
