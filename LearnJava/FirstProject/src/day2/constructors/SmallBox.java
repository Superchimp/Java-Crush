package day2.constructors;

public class SmallBox {
	
	int length;
	int width;
	
	/*
	 * Constructor is a method that has the same name as the class
	 * It is executed when an object is created.
	 * It is used to set default values.
	 * A constructor does not return anything including void
	 */
	
	// This constructor makes a default object (no arguments passed)
	SmallBox(){
		this.length = 5;
		this.width = 6;
		System.out.println("Constructor fired");
	}
	
	// This constructor fires when two arguments are passed to the SmallBox constructor
	SmallBox(int length, int width){ // here we are taking the arguments of two int values
		this.length = length; // And here we assign the passed arguments to the Class Level Data
		this.width = width;  // This means we are using the passed arguments as the values for
		                     // the next time we run calculateArea and not the default values (5, 6)
	}                        // This type of constructor is often called "Constructor Overloading"
	
	
	void calculateArea() {
		System.out.println("Area = " + (length * width));
	}

}
