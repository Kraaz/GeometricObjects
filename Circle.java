public abstract class Circle extends GeometricObject
{
	protected double radius;

	// Default constructor
	public Circle ()
	{
		super();
		radius = 1;

	}

	// Constructor med parametre
	public Circle (double r, double t)
	{
		super(t);
		radius = r;

	}
	// Gir radius
	public double getRadius()
	{
		return radius;
	}
	// Setter radius
	public void setRadius(double r)
	{
		radius = r;
	}

	//Regner ut areal
	public double findArea()
	{
		return radius * radius * Math.PI;
	}

	//Regner ut omkrets
	public double findCircumference()
	{
		return 2 * radius * Math.PI;
	}

	//Regner ut vekten
	/*public double findWeight()
	{
		return super.getWeight() * Math.PI * radius * radius * getThickness();
	}*/
	//Inneholder data for sirkelen
	public String toString()
	{
		return "The circle radius is: " + radius + "m" +
		"\nThe thickness is: " + getThickness() + "m" +
		"\nThe area is: " + findArea() + "m^2";
	}

}