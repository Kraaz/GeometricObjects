public class Circle extends GeometricObject
{
	private double radius;
	public Circle ()
	{
		super(0.01);
		radius = 1;

	}
	public Circle (double r, double t)
	{
		super(t);
		radius = r;

	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius = r;
	}
	public double findArea()
	{
		return radius * radius * Math.PI;
	}
	public double findCircumference()
	{
		return 2 * radius * Math.PI;
	}
	public String toString()
	{
		return "Circle radius= " + radius + super.toString();
	}
	public double findWeight()
	{
		return super.getWeight() * Math.PI * radius * radius * getThickness();
	}

}