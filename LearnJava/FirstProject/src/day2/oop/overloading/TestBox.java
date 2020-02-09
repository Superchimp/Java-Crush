package day2.oop.overloading;

public class TestBox {

	public static void main(String[] args) {
		
		Box obj = new Box();
		
		obj.calculateArea(4); // uses the method that takes one int
		obj.calculateArea(3.7); // uses the method that takes a float (double)
		obj.calculateArea(2,4); // uses method that takes two int arguments 



	}

}
