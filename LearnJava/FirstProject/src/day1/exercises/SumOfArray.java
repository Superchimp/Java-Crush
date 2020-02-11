package day1.exercises;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ints = {20,40,30,10};
		int sum = 0;
		
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i];
		}
		System.out.println("Sum = " + sum);

	}

}
