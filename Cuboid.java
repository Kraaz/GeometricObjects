public class Cuboid extends Rectangle
{
	//private double length;
	//private double height;
	private double depth;
	
	public Cuboid ()
	{
		super();
		depth 	 = 2.0;
	}

	public Cuboid( double t, double l, double h, double d)
	{
		super(t, l,h);
		depth 	= d;
	}

	public double getlength()
	{
		return getlength();
	}
	
	public double getHeight()
	{
		return getHeight();
	}

	public double getDepth()
	{
		return depth;
	}

	public double findVolume()
	{
		return findArea() * depth;
	}

	public double findWeight()
	{
		return 7.8* (findVolume()) -
		 	   (length - thickness * length - thickness * depth - thickness);
	}

	public String toString()
	{
		return 
		"Volume is: " + findVolume() + " m^3" +
		"\nWeight is: " + findWeight() + " kg";
	}


}