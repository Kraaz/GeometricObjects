public class Cylinder extends Circle
{
	//private double radius;
	private double height;

	//Default constructor
	public Cylinder ()
	{
		super();
		height = 3;

	}
	
	//Constructor med parametre
	public Cylinder (double t, double r, double h)
	{
		super(t, r);
		height = h;

	}

	public double getHeight()
	{
		return height;
	}
	
	//Regner ut volum
	public double findVolume()
	{
		return Math.PI * radius * radius * height;
	}
		public double findInnerVolume()
	{
		return Math.PI * radius - thickness * radius - thickness * height - thickness;
	}
	public double findWeight()
	{
		return weight * (findVolume() - findInnerVolume());
	}

	//Regner ut vekten

	//Inneholder data for 
	public String toString()
	{
		return "The radius of the cylinder is: " + radius + "m" +
		//"\nThe thickness is: " + getHeight() + "m" +
		"\nThe volume is: " + findVolume() + "m" ;
		//"\nWeight: " + findWeight() + "kg"; 
	}
}