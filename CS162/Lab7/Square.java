package Lab7;

/*  @Author: LinRui
	@Time: May 15, 2022 2:54:29 AM	*/

public class Square {
	private int length;
	
	public Square() {
		length = 1;		
	}
	
	public Square(int length) {
		this.length = length;
	}
	
	public void setLength(int MyLength) {
		length = MyLength;
	}
	
	public int getArea() {
		return length*length;	
	}
	
	public String toString() {	
		String details = "LENGTH: "+ length;
		return details;		
	}
	
	
	
}



