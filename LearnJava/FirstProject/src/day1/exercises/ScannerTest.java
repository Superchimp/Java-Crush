package day1.exercises;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// Getting user input is MUCH harder than Python OMG!
		
		// First we make a Scanner Object by using a constructor passing System.in
		// it hasn't actually scanned anything yet just knows where to scan later
		Scanner myVar = new Scanner(System.in);
		
		// Here we make a variable to store the input although technically not needed (see Line 23)
		String food;
		
		// Just ask the user for their favourite food
		System.out.println("What is your favourite food?");
		
		// At this point the myVar object will wait for Enter to be pressed and trigger a Scan of the 
		// next line. If you look at the later example you can see how it can also run in a print line
		food = myVar.nextLine();
		
		// And here we print the value of food that was what was scanned using myVar Object before
		System.out.println("I like " + food + " too!");
		
		System.out.println("------");
		
		// This next example is going to ask for something else...
		System.out.println("What is your favourite colour?");
		
		// We use the myVar.nextLine() to pause the code and wait for the System.in it was made to look
		// for. So what actually happens here is that this print line actually pauses the code and waits
		// for Enter to be pressed and then uses nextLine method in it to scan the current line changing
		// the value held in myVar. This happens while it is trying to print on a new line but couldn't
		// until the myVar.nextLine ran. So now that it has it will then run the print new line and then
		// concatenate the new value in myVar with the string in the print statement. COMPLICATED!
		System.out.println(myVar.nextLine() + " is my favourite colour too!");
	
		

	}

}
