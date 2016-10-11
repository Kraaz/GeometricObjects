public class Rectangle extends GeometricObject
{
	private double length;
	private double height;
	public Rectangle ()
	{
		length	 = 1.0;
		height	 = 1.0;
	}
	public Rectangle(double l, double h)
	{
		length 	= l;
		height 	= h;
	}

	public double getlength()
	{
		return length;
	}
	public double getHeight()
	{
		return height;
	}

	public void setlength(double w)
	{
		length = w;
	}
	public double findArea()
	{
		return length*height;
	}
	public double findCircumference()
	{
		return 2*length+2*height;
	}
}