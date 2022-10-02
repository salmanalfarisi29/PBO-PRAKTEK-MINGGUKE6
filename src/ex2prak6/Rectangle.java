package ex2prak6;

public class Rectangle extends Shape {
	//inisialisasi
	private double width;
	private double length;
	
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	
	//constructor
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	//getter and setter
	public double getWidth() {
		return width;
	}
		
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	//method
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public String toString() {
		return "A Rectangle with width = " + width + " and length= " + length + " which is a sublcass of " + super.toString();
	}
	
	//test
		public static void main (String[] args) {
			Rectangle r1 = new Rectangle ();
			Rectangle r2 = new Rectangle (7.0, 10.0);
			Rectangle r3 = new Rectangle (5.0, 7.0, "blue", false);
			
			System.out.println("------");
			System.out.println("Rectangle");
			System.out.println("------");
			
			r1.setColor("red");
			System.out.println(r1.toString());
			System.out.println("Area: " + r1.getArea());
			System.out.println("perimeter: " + r1.getPerimeter());
			System.out.println("-------------------------------");
			r2.setFilled(false);
			System.out.println(r2.toString());
			System.out.println("Area: " + r2.getArea());
			System.out.println("perimeter: " + r2.getPerimeter());
			System.out.println("-------------------------------");
			r3.setFilled(true);
			System.out.println(r3.toString());
			System.out.println("Area: " + r3.getArea());
			System.out.println("perimeter: " + r3.getPerimeter());
			System.out.println("-------------------------------");
		}
	
	
	
}
