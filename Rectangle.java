public abstract class Rectangle extends GeometricObject
{
	protected double length;
	protected double height;
	public Rectangle ()

	{
		super();
		length	 = 2.0;
		height	 = 1.0;
	}
	public Rectangle(double t, double l, double h)
	{
		super(t);
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
		return length * height;
	}

	public double findVolume()
	{
		return length * height * getThickness();
	}

	public double findCircumference()
	{
		return 2*length+2*height;
	}

	public String toString()
	{
		return "Dimensions of rectangle: " + length + "m" + " x " + height + "m" + 
		"\nArea is: " + findArea() + " m^3" +
		"\nVolume is: " + findVolume() + " m^3" +
		"\nCircumference: " + findCircumference() + "m";
	}


}