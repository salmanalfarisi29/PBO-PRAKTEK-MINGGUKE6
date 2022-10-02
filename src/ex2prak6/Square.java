package ex2prak6;

public class Square extends Rectangle {
	
	//constructor
	public Square() {
		super();
	}
	
	public Square(double side) { //memanggil superclass rectangle(double, double)
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	//override to String
	public String toString() {
		return "A Square with width = " + super.getLength() + "|  which is a sublcass of " + super.toString();
	}
	
	//override method
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	//test
	public static void main (String[] args) {
		Square sq1 = new Square ();
		Square sq2 = new Square (7.0);
		Square sq3 = new Square (5.0, "blue", false);
		
		System.out.println("------");
		System.out.println("SQUARE");
		System.out.println("------");
		
		sq1.setColor("red");
		System.out.println(sq1.toString());
		System.out.println("Area: " + sq1.getArea());
		System.out.println("perimeter: " + sq1.getPerimeter());
		System.out.println("-------------------------------");
		sq2.setFilled(false);
		System.out.println(sq2.toString());
		System.out.println("Area: " + sq2.getArea());
		System.out.println("perimeter: " + sq2.getPerimeter());
		System.out.println("-------------------------------");
		sq3.setFilled(true);
		System.out.println(sq3.toString());
		System.out.println("Area: " + sq3.getArea());
		System.out.println("perimeter: " + sq3.getPerimeter());
		System.out.println("-------------------------------");
	}
}
