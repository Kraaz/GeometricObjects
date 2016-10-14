public abstract class Triangle extends GeometricObject
{
	protected double length, height;
	Triangle()
	{
		super();
		length = 1;
		height = 1;
	}
	Triangle (double t, double l , double h)
	{
		super(t);
		length = l;
		height = h;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double l)
	{
		length = l;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	public double findArea()
	{
		return (height * length) / 2;
	}
	public String toString()
	{
		return "length: " + length + " m" + "\nheight: " + height + " m";
	}

}