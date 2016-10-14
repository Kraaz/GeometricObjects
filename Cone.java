public class Cone extends Circle
{
	private double height;

	//Default constructor
	public Cone ()
	{
		super();
		height = 3;

	}
	
	public double getHeight()
	{
		return height;
	}

	//Constructor med parametre
	public Cone (double t, double r, double h)
	{
		super(r, t);
		height = h;

	}
	
	//Regner ut volum
	public double findVolume()
	{
		return Math.PI * radius * radius * (height/3);
	}
		public double findInnerVolume()
	{
		return Math.PI * radius - thickness * radius - thickness * ((height - thickness )/3);
	}
	public double findWeight()
	{
		double w = 0;
		return w;
	}

	//Regner ut vekten
	
	
	//Inneholder data for sirkelen
	public String toString()
	{
		return "The radius of the cone at base is: " + radius + "m" + "\nThe volume is: " + findVolume() + "m" ;
		//"\nThe thickness is: " + getHeight() + "m" + 
		//"\nWeight: " + findWeight() + "kg"; 
	}
}