package day1.examples;

public class ExampleSwitchCase {

	public static void main(String[] args) {
		
		int n = 2;
		
		switch(n) {
		
			case 0:
				System.out.println("Value is 0");
				break;
			case 1:
				System.out.println("Value is 1");
				break;
			case 2:
				System.out.println("Value is 2");
				//break;    Oooopsie!
			case 3:
				System.out.println("Value is 3");
				break;
			default:
				System.out.println("Out of Bounds");
				break;
		
		}
		
		String s = "On";
		
		switch(s) {
			
			case "Zero":
				System.out.println("Value is Zero");
				break;
			case "One":
				System.out.println("Value is One");
				break;
			case "Two":
				System.out.println("Value is Two");
				break;
			case "Three":
				System.out.println("Value is Three");
				break;
			default:
				System.out.println("Out of Bounds");
				break;
			
				
		}

	}

}
