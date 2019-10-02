/*Write a program to find that given number or string is palindrome
or not.*/
import java.util.Scanner;
class u2p5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int flag=1;
		for(int i=(str.length()-1),j=0;i>=0;i--,j++)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=0;
				break;
			}
				
		}
		if (flag==1)
			System.out.println("The  String " + str + " is Palindrome");
		else
			System.out.println("The  String " + str + " is not Palindrome");
	}
}
