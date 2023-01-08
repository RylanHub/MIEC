package Lab7;

/*  @Author: LinRui
	@Time: May 15, 2022 3:00:14 AM	*/

public class TestSquare {

	public static void main(String[] args) {
		
		Square[] squares = new Square[4];
		for(int i = 0; i<squares.length;i++) {
			squares[i] = new Square(); 
		}
		
		squares[0].setLength(10);
		squares[2].setLength(10);
		
		for(int i = 0; i<squares.length;i++) {
			System.out.println("Square "+(i+1)+" has a side length of "+squares[i]);
		}
		
		System.out.println("Square 1 has an area of " + squares[1].getArea());
		System.out.println("Square 2 has an area of " + squares[2].getArea());
		System.out.println(squares[2].toString());

	}

}
