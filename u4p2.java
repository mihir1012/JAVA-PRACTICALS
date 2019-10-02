class Shape
{
	double length,width;
	Shape()
	{
		length=0;
		width=0;
	}
	Shape(double l, double w)
	{
		length=l;
		width=w;
	}
	double Area()
	{
		return length*width;
	}
}
class Rectangle extends Shape
{
	Rectangle()
	{
		super();
	}
	Rectangle(double L,double W)
	{
		super(L,W);
	}
	double Area()
	{
		return super.Area();
	}
}
class Triangle extends Shape
{
	Triangle()
	{
		super();
	}
	Triangle(double L,double W)
	{
		super(L,W);
	}
	double Area()
	{
		return 0.5*super.Area();
	}
}
class u4p2
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle(4,5);
		Triangle t1 = new Triangle(4,5);
		Shape r2 = new Rectangle(4,6);
		System.out.println(" Area of Rectangle is " + r1.Area());
		System.out.println(" Area of Rectangle is " + r2.Area());
		System.out.println(" Area of Triangle is " + t1.Area());
	}
}
