package day2.oop.overloading;

public class Box {
	
	
	/*
	 * Polymorphism
	 * Overloading: When methods of the same name are differentiated by
	 *              their passing arguments, resulting in different methods
	 *              being run according to the arguments passed
	 */
	
	void calculateArea(int length) {
		System.out.println("Area = " + (length * length));
	}
	
	void calculateArea(double length) {
		System.out.println("Double Area +" + (length * length));
	}
	
	void calculateArea(int length, int width) {
		System.out.println("Double Area v2 = " + (length * width));
	}

}
