package selfStudy4.ShapeAndSubclasses;

public class Square extends Rectangle
{
	public String toString()
	{
		return ("Square [Rectangle [Shape [color=" + getColor() + ", filled=" + isFilled() + "], width=" + getWidth() + ", length=" + getLength() + "]]");
	}
}
