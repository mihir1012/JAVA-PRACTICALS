/*Write a simple java application that reads marks of five subjects
through command line arguments and display average. The application should
generate an exception if marks are not in integer format and out of 0-100.*/
class Emj //extends Exception
{
}
class u6p1
{
	public static void main(String args[])
	{
		int marks[]=new int[args.length],avg=0;
		for (int i = 0; i < args.length ; i++)
		{
			try
			{
				marks[i]=Integer.parseInt(args[i]);
				if(marks[i]<0 || marks[i]>100)
				{	
					//throw new Emj();	//Emj cannot be converted to Throwable
					throw new ArithmeticException();
				}
			}
			catch( NumberFormatException e)
			{
				System.out.println("Invalid input");
				return;
			}
			/*catch(Emj e)
			{	
				System.out.println("Invalid MArks");
				return;
			}*/
			catch(ArithmeticException e)
			{
				System.out.println("Invalid Marks");
				return;
			}
			System.out.println("The marks of Subject  "+ (i+1)+" : " +marks[i]);
			avg+=marks[i];
		}
		avg /= args.length;
		System.out.println("The Average of the marks is "+ avg);
	}
}
