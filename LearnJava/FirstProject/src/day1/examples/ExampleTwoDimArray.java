package day1.examples;

public class ExampleTwoDimArray {

	public static void main(String[] args) {

		int[][] twodim = new int[4][3]; // the 4 = how many rows, 3 = how many columns
		
		//twodim[2][1] = 10;     // This would set index twodim[2][1]n to value 10 
		
		int temp = 10;
		
		for(int y = 0; y < 4; y++) { // y axis is made first (= 4 rows)
			for(int x = 0; x < 3; x++) { // x axis is made second (= 3 columns)
				twodim[y][x] = temp;  // place the value of temp to current coordinate 
				temp += 10;  		// incrementing the value of temp by 10
			}
		}// Printing the matrix
		for(int y = 0; y < 4; y++) { // remember to use inverse with matrix Not X then Y but Y then X
			for(int x = 0; x < 3; x++) {
				
				System.out.print(twodim[y][x] + " "); // Print the value of current index without new line
			}
			System.out.println(); // Add a new line for printing through next for loop
		}

		
	}

}
