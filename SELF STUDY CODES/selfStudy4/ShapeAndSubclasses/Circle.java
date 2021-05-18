package selfStudy4.ShapeAndSubclasses;

public class Circle extends Shape
{
	private double radius=0.0;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [Shape [color=" + getColor() + ", filled=" + isFilled() + "], radius=" + radius + "]";
	}
	
	
}
