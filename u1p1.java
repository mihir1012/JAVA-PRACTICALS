//a program to calculate percentage marks of the student for six subjects and display grade.
import java.util.Scanner;
class u1p1
{
	public static void main(String args[])
	{
		int i,j;
		float perc=0;
		Scanner s= new Scanner(System.in);
		int m[]=new int[6];
		for( i=0 ; i < 6; i++ )
		{
			System.out.print("Enter marks of the subject " + (i+1) + "= ");
			m[i]=s.nextInt();
			//if( m[i] > 100 && m[i] < 0 ){	System.out.println("Invalid Input "); i--;}
		}
		
		for( i=0 ; i < 6; i++ )
		{
			perc += m[i];
		}
		
		perc /= 6;
		
		System.out.println("The percentage of the student is : " + perc);
		
		if( perc < 34 ){	System.out.println("FAIL");}
		else if( perc > 34 && perc < 51 ){	System.out.println("GRADE D");}
		else if( perc < 61 && perc > 49 ){	System.out.println("GRADE C");}
		else if( perc < 71 && perc > 59 ){	System.out.println("GRADE B");}
		else if( perc < 101 && perc > 69 ){	System.out.println("GRADE A");}
	}
}
