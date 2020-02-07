package day2.classandobject;

public class Box {
	
	int length;  // <= Called Class Level Data
	int width;
	
	
	// Note that Arguments take precedence over Class Level Data 
	int calculateArea(int length, int width) {  // (int x, int y) = How to pass an argument to a method
		int area = this.length * this.width;  // overide arguments with "this." keyword
		System.out.println("Area = " + area);
		return area;
	}

}
