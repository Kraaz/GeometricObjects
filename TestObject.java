import java.util.Scanner;
public class TestObject
{

	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x,y;
		System.out.println("Select an object" + 
			"\n Type 1 for circle" +  
			"\n Type 2 for rectangle" + 
			"\n Type 3 for cylinder" + 
			"\n Type 4 for cone" + 
			"\n Type 5 for sphere" + 
			"\n Type 6 for cuboid" );

		switch (input.nextInt())
		{
			case 1: circle(); //objectType = "Circle";
					
					break;
			case 2: //objectType = "Rectangle";
					break;
			case 3: //objectType = "Cylinder";
					break;
			case 4: //objectType = "Cone";
					break;
			case 5: //objectType = "Sphere";
					break;
			case 6: //objectType = "Cuboid";
					break;
		}


		



		/* (input.nextInt() == 1)
		{
			System.out.println("Velg radius i meter: ");
			x = input.nextDouble();
			System.out.println("Velg tykkelse i meter: ");
			y = input.nextDouble();

			Circle circle1 = new Circle(x,y);
			System.out.println(circle1.toString());

		}*/


	}

	private static void circle()
	{
		Circle object = new Circle();
		System.out.println(object.toString());
	}
}