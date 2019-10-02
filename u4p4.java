import java.util.Scanner;
import java.text.DecimalFormat;
interface Shape
{
	double PI = 3.14159;
	void read();
	void show();
	
}
class Rectangle implements Shape
{
	double length,width;
	public void read()
	{
		Scanner S = new Scanner(System.in);
		length = S.nextDouble();
		S.nextLine();
		width = S.nextDouble();
	}
	public void show()
	{
		System.out.println("The area of rectangle " + length * width );
	}
}

class Circle implements Shape
{
	double radius;
	public void read()
	{
		Scanner S = new Scanner(System.in);
		radius = S.nextDouble();
	}
	public void show()
	{
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		System.out.print("The area of circle with radius "+ radius + " is " +numberFormat.format(PI * radius * radius));
		
	}
}
class u4p4
{
	public static void main(String args[])
	{
		Circle c1= new Circle();
		Rectangle r1= new Rectangle();
		r1.read();
		r1.show();
		c1.read();
		c1.show();
		
	}
}
