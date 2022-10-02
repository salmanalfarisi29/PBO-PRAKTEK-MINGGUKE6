package ex2prak6;

public class Circle extends Shape {
	//inisiasi variabel
	private double radius;
	
	//constructor
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	//getter and setter
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Method
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
	
	//override
	public String toString() {
		return "A circle with radius " + radius + ", which is a subclass of " + super.toString();
	}
	
	//test
	public static void main (String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(7.0);
		Circle c3 = new Circle(5.0, "blue", false);
		
		System.out.println("------");
		System.out.println("Circle");
		System.out.println("------");
		
		c1.setColor("red");
		System.out.println(c1.toString());
		System.out.println("Area: " + c1.getArea());
		System.out.println("perimeter: " + c1.getPerimeter());
		System.out.println("-------------------------------");
		c2.setFilled(false);
		System.out.println(c2.toString());
		System.out.println("Area: " + c2.getArea());
		System.out.println("perimeter: " + c2.getPerimeter());
		System.out.println("-------------------------------");
		c3.setFilled(true);
		System.out.println(c3.toString());
		System.out.println("Area: " + c3.getArea());
		System.out.println("perimeter: " + c3.getPerimeter());
		System.out.println("-------------------------------");
	}
}
