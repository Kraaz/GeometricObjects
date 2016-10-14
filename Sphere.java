public class Sphere extends Circle
{
	/*
	Volume of a sphere V = 4/3 * PI * r^3
	Area of a cirle A = PI * r^2
	Therefore V = A * 4/3 * r
	*/

	//private double radius;

	//Default constructor
	public Sphere ()
	{
		super();
	}

	//Constructor med parametre
	public Sphere (double t, double r)
	{
		super(t, r);
		

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

	//Regner ut volum
	public double findVolume()
	{
		return (4/3) * Math.PI * radius * radius * radius;
	}


	public double findInnerVolume()
	{
		return (4/3) * Math.PI * radius-thickness * radius-thickness * radius-thickness;
	}

	/*
	To calculate the physical volume of a hollow sphere:
	V_0 = 4/3 * PI * r^3
	V_1 = 4/3 * PI * (r-getThickness)^3
	V_3 = V_0 - V_1
	*/

	//Regner ut vekten
	public double findWeight()
	{
		return weight * 
		(findVolume()) - 
	    (findInnerVolume());
	}

	//Inneholder data for sirkelen
	public String toString()
	{
		return "The radius of the sphere is: " + radius + "m" +
		"\nThe thickness is: " + getThickness() + "m" +
		"\nThe volume is: " + findVolume() + "m^3" +
		"\nWeight: " + findWeight() + "kg"; 
	}
}