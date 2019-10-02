/*Write a program to count the number of words that start with
capital letters.*/
import java.util.Scanner;
class u2p4
{
	public static void main(String[] args)
	{
	    Scanner in=new Scanner(System.in);
	    String s;
	    System.out.print("Enter a line:");
	    s=in.nextLine();
	    int ct=0;
	    String str[] = s.split(" ");
	    for(int i=0;i<str.length;i++)
		{
			if(str[i].charAt(0)>=65 && str[i].charAt(0)<=90)
			{
				ct++;
			}
		}		
	    System.out.println("total  number of words start with capital letters are :"+ct);
	}
}
