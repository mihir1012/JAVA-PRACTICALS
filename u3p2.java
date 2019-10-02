/*Write a simple java application that defines a class Complex with
real(int) and img(int) as data fields, no-argument constructor and parameterized
constructor. The class should have overloaded methods to perform addition of
two Complex numbers by passing objects as arguments.*/

class Complex
{
	int real,img;
	Complex()
	{
		real = -1;
		img = -1;
	}
	Complex(int a,int b)
	{
		this.real = a;
		this.img = b;
	}
	void addition(Complex c)
	{
		real += c.real;
		img += c.img;
	}
	
	Complex addition(int a,int b)
	{
		return new Complex(real + a, img + b);
	}
	
	void Display()
	{
		System.out.println("Real : " + real + " Imaginary : " + img);
	}
	
}
class u3p2
{
	public static void main(String args[])
	{
		Complex c1 = new Complex();
		c1.Display();
		Complex c2 = new Complex(1,2);
		c2.Display();
		Complex c3;
		c1.addition(c2);
		c1.Display();
		c3 = c1.addition(c2.real,c2.img);
		c3.Display();
	}
}
