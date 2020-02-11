package day1.exercises;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = "";
		
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				result = result + "Fizz";
			}
			if (i % 5 == 0) {
				result = result + "Buzz";
			}
			if (result == "") {
				result = Integer.toString(i);
			}
			System.out.println(result);
			
			result = "";
		}

	}

}
