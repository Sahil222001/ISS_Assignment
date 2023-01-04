package src.Circle;
public class Circle {
	private int radius;
	
	public Circle(int r) {
		radius = r;
	}
	public double disp() {
		return (3.14 * radius * radius);
	}
}