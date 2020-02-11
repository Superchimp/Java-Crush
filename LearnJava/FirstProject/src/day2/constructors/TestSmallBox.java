package day2.constructors;

public class TestSmallBox {

	public static void main(String[] args) {


		SmallBox obj1 = new SmallBox(); // when this line runs the default constructor is fired
		// No arguments are passed above thus using default
		obj1.calculateArea();
		
		// Here we fire the second constructor because we are passing arguments
		// This is called Constructor Overloading
		SmallBox obj2 = new SmallBox(3,4);
		obj2.calculateArea();

	}

}
