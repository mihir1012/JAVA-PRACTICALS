/*Create a class which asks the user to enter a sentence, and it should
display count of each vowel type in the sentence. The program should continue
till user enters a word “quit”. Display the total count of each vowel for all
sentences*/
import java.util.Scanner;
class u2p6
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int noVow=0,noSpc=0,newVow=0;
		String vowels = "aeiouAEIOU";
		while(true)
		{
			newVow=0;
			System.out.print("Enter the String (quit to end):");
			String str=s.nextLine();
			if(str.equals("quit"))
			{
				break;
			}
			for(int i=0;i<str.length();i++)
			{
				for(int j=0;j<vowels.length();j++)
				{
					if( str.charAt(i) == vowels.charAt(j))
					{
						noVow++;
						newVow++;
					}
					else if( str.charAt(i)==' ')
					{
						noSpc++;
					}
				}
			}
			System.out.println("The number of Vowels : " + newVow );
		 }
		 
		 System.out.println("The number of Total Vowels : " + noVow );
	}
}
