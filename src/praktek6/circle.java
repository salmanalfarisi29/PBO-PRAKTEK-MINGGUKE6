package praktek6;

public class circle {
	private double radius;
	private String color;
	
	public circle() { //1st (default) constructor
		radius = 1.0;
		color = "red";
	}
	
	public circle(double r) { //2nd constructor
		radius = r;
		color = "red";
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	//3rd constructor
	public circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	//mengambil warna
	public String getColor() {
		return color;
	}
	
	//mensetting warna
	public void setColor(String color) {
		this.color = color;
	}
	/** Return a self-descriptive string of this instance in the form of
	Circle[radius=?,color=?] */
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color +"]";
	}
}

