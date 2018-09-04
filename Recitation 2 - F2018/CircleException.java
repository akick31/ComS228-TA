
public class CircleException extends Exception{
	private double radius;
	public CircleException(double radius) {
		super("Invalid radius " + radius);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
}
