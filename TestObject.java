import java.util.Scanner;
public class TestObject
{

	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x,y;
		System.out.println("Tast 1 for aa lage en sirkel");
		if (input.nextInt() == 1)
		{
			System.out.println("Velg radius i meter: ");
			x = input.nextDouble();
			System.out.println("Velg tykkelse i meter: ");
			y = input.nextDouble();

			Circle circle1 = new Circle(x,y);
			System.out.println("Sirkelen er ferdig!");
			System.out.println("Arealet er: " + circle1.findArea() + " m^3");
			System.out.println("Vekten er: " + circle1.findWeight() + " kg");

		}


	}
}