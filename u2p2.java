/*Write a program to find length of string and print second half of the
string.*/
class u2p2
{
    public static void main(String args[])
     {
        int i;
        String s1= "Good Morning";
        for(i=0;i<s1.length();i++)
        {
           System.out.println(s1.charAt(i));
        }
        for(i=s1.length()/2;i<s1.length();i++)
        {
           System.out.print(s1.charAt(i));
        }
    } 	
}
