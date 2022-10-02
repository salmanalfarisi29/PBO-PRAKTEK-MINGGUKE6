package ex2prak6;

public class Shape {
	//inisiasi variabel
	private String color;
	private boolean filled;
	
	//constructor
	public Shape() {
		color = "red";
		filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	//getter and setter
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if(isFilled() == true)
			return "A shape with color of " + color + " and filled";
			else
				return "A shape with color of " + color + " and not filled";
	}
	
	public static void main (String[] args) {
	Shape s1 = new Shape();
	Shape s2 = new Shape("red", true);
	
	System.out.println("Shape");
	System.out.println("------");
	
	s1.setColor("blue");
	System.out.println(s1.toString());
	s2.setFilled(false);
	System.out.println(s2.toString());
	}
	
	
}
