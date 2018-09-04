
public class Circle {
	private double radius;
	private static int count=0;
	public Circle(double radius) throws CircleException {
		if(radius > 0) {
			this.radius = radius;
			count++;
		}
		else
			throw new CircleException(radius);
	}
	
	public static void main(String[] args) {
		for(double i=-1;i<5;i++) {
			try {
				Circle c = new Circle(i);
			}
			catch (CircleException ex) {
				System.out.println("Error instantiating circle with " + ex.getRadius());
			}
		}
		System.out.print(Circle.count + " circles created!");
	}
}
