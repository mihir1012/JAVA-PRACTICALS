/*Write a program to enter two numbers and perform mathematical
operations on them*/
import java.util.Scanner;
class u1p2
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter a =");
		a=s.nextInt();
		System.out.print("Enter b =");
		b=s.nextInt();
		System.out.println("1.Addition  \n2.Subtraction \n3.Multiplication \n4.Division");
		System.out.print("Enter Choice :");
		c=s.nextInt();
		switch(c)
		{
			case 1:
			System.out.println("Addition is :"+(a+b));
			break;
			case 2:
			System.out.println("Subtraction is :"+(a-b));
			break;
			case 3:
			System.out.println("Multiplication is :"+(a*b));
			break;
			case 4:
			System.out.println("Division :"+(a/b));
			break;
		}
	}
}
