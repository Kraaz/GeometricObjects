public class Cylinder extends Circle
{
	private double height;

	Cylinder()
	{
		super(1.0);
		height = 1.0;
	}
	Cylinder(double h, double r)
	{
		super(r);
		height = h;
	}

	public double findVolume()
	{
		return Math.PI * getRadius() * getRadius() * height;
	}
	/*public toString()
	{

	}*/
}