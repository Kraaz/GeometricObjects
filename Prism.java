public class Prism extends Triangle
{
	private double depth;
	Prism()
	{
		super();
		depth = 1;
	}
	Prism(double t, double l, double h, double d)
	{
		super(t, l, h);
		depth = d;
	}
	public double getDepth()
	{
		return depth;
	}
	public void setDepth(double d)
	{
		depth = d;
	}

	public double findCircumference()
	{
		double c = 0; //DO MATH
		return c;
	}
	public double findVolume()
	{
		double x = 0; //DO MATH
		return x; 
	}
	public double findInnerVolume()
	{
		double y = 0; //DO MATH
		return Y;
	}

	public double findWeight()
	{
		return weight * findVolume() - findInnerVolume(); 

	}
	public String toString()
	{
		return super.toString() + "\ndepth: " + depth + "\nCircumference: " + findCircumference(); // <------- ADD MORE STUFF HERE
	}
}