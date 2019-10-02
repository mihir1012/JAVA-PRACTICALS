/*Write a java program using nested try-catch blocks. If user enters
only one command line argument than inner try block should throw an
Exception. If user enters two command line arguments, divide first argument by
second argument. If second argument is zero than proper exception should behandled*/
class u6p2
{
	public static void main(String args[])
	{
		float op1,op2;
		try
		{
			try
			{
				if(args.length <= 1)
					throw new ArithmeticException();
			}
			catch ( ArithmeticException e)
			{
				System.out.println("Only 1 or NO Argument Detected");
				return;
			}
			op1=Float.parseFloat(args[0]);
			op2=Float.parseFloat(args[1]);
			if(op2==0)
				throw new ArithmeticException();
			else
			{
				System.out.println("The Division :"+ (op1/op2));
				return;
			}	
		}
		catch (ArithmeticException e)
		{
			System.out.println("Division by Zero ");
			return;
		}
	}
}
