package day2.classandobject;

public class TestBox {

	public static void main(String[] args) {
		
		
		Box ups = new Box();
		Box fedEx = new Box();
		
		ups.length = 5;
		ups.width = 10;
		int upsArea = ups.calculateArea(4,3); 
		
		fedEx.length = 6;
		fedEx.width = 7;
		int fedExArea = fedEx.calculateArea(2,5);
		
		
		System.out.println("Total of ups and fedEx = " + (upsArea + fedExArea));
		

	}

}
