package selfStudy4.ShapeAndSubclasses;

public class Rectangle extends Shape
{
	private double width=1.0;
	private double length=1.0;
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
	@Override
	public String toString() {
		return "Rectangle [Shape [color=" + getColor() + ", filled=" + isFilled() + "], width=" + width + ", length=" + length + "]";
	}
	
	
}
