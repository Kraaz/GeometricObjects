public abstract class GeometricObject
{
	private double thickness;
	private double weight = 7.8;
	protected GeometricObject ()
	{
		thickness = 0.01;
	}
	protected GeometricObject( double t)
	{
		thickness = t;
	}

	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double w)
	{
		weight = w;
	}
	public String toString()
	{
		return "Weight = " + weight; 
	}
	public double getThickness()
	{
		return thickness;
	}
	public void setThickness(double t)
	{
		thickness = t;
	}



	abstract double findArea();
	abstract double findCircumference();

	/*
	
	abstract double findSurfaceArea(); 
	abstract double getHeight();
	abstract double findVolume();
	abstract double getThickness();
	
	abstract void setArea();
	abstract void setThickness();
	abstract void setHeight();
	*/


}