import java.util.Scanner;
public class TestObject
{

	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x,y;
		System.out.println("Hello and welcome to Oblig 4." +
			"\nPlease choose a geometric figure and press enter" + 
			"\nTast 1 for circle" +  
			"\nTast 2 for rectangle" + 
			"\nTast 3 for cylinder" + 
			"\nTast 4 for cone" + 
			"\nTast 5 for sphere" + 
			"\nTast 6 for cuboid");

		switch (input.nextInt())
		{
			case 1: 
			{
				System.out.println("You have chosen a cylinder");
				cylinder(); //objectType = "Cylinder";

					break;
			}

			case 2: 
			{
				System.out.println("You have chosen a cone");
				cone(); //objectType = "Cone";
			}
			
					break;
			
			case 3: 
			{
				System.out.println("You have chosen a sphere");
				sphere(); //objectType = "Sphere";
				
			}
					
					break;

			case 4:
			{
				System.out.println("You have chosen a cuboid");
				cuboid(); //objectType = "Cuboid";
			
			}	
					break;
			case 5:
			{
				System.out.println("You have chosen a prism");
				prism();
			}

		}
	}

	private static void cylinder()
	{
		double thickness = getUserInput(chooseThickness());
		double radius = getUserInput("Choose a radius");
		double height = getUserInput("Choose a height");
		Cylinder object = new Cylinder(thickness, radius, height);
		System.out.println(object.toString());
	}

	private static void cone()
	{
		double thickness = getUserInput(chooseThickness());
		double radius = getUserInput("Choose a radius");
		double height = getUserInput("Choose a height");
		Cone object = new Cone(thickness, radius, height);
		System.out.println(object.toString());
	}

	private static void sphere()
	{
		double thickness = getUserInput(chooseThickness());
		double radius = getUserInput("Choose a radius");
		Sphere object = new Sphere(thickness, radius);
		System.out.println(object.toString());
	}

	private static void cuboid()
	{
		double thickness = getUserInput(chooseThickness());
		double length = getUserInput("Choose a lenght");
		double height = getUserInput("Choose a height");
		double width = getUserInput("Choose a width");
		Cuboid object = new Cuboid(thickness, length, height, width);
		System.out.println(object.toString());
	}
	private static void prism()
	{
		// create a prism here

	}
	private static String chooseThickness()
	{	
		return "Choose a thickness for your object:";
	}
	
	// Recieves dimensions etc. from user
	private static double getUserInput(String s)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(s);
		return input.nextDouble();


	}

/*
Order of printouts for toString:
Dimensions
Thickness
Area
Volume
Weight
*/
}