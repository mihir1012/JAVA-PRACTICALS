/*Write a program to accept a line and check how many consonants
and vowels are there in line.*/
import java.util.Scanner;
class u2p3
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		int noVow=0,noSpc=0;
		String vowels = "aeiou";
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<vowels.length();j++)
			{
				if( str.charAt(i) == vowels.charAt(j))
				{
					noVow++;
				}
				else if( str.charAt(i)==' ')
				{
					noSpc++;
				}
			}
		}
		
		System.out.println("The numbeer of vowels is "+ noVow + " and number of consonants is " + (str.length()-noVow-noSpc));
	}
}
