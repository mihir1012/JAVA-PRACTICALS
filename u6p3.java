/*Write a simple java application that declares Employee class. The
program should generate and handle custom exceptions such as
a. InvalidEmailAddressException if the address does not contains . and @
b. InvalidTelephoneNumberException if total no of digits > 10.*/


import java.util.Scanner;
class InvalidEmailAddressException extends Exception
{
}
class InvalidTelephoneNumberException extends Exception
{
}
class Employee
{
	String name;
	String email;
	String phone;
	
	void setValue()
	{
		Scanner S1 = new Scanner(System.in);
		System.out.print("Enter the name of the Employee :");
		name = S1.nextLine();
		System.out.print("Enter the email of the Employee :");
		try
		{
			email = S1.nextLine();
			if(!validEmail())
			{
				throw new InvalidEmailAddressException();
			}
			
		}
		catch(InvalidEmailAddressException e)
		{
			System.out.println("Invalid Email:	Please enter valid email containing \'@\' followed by \'.\'");
			return;
		}	
		System.out.print("Enter the phonenumber of the Employee :");
		
		try
		{
			phone = S1.nextLine();
			if(!validPhoneNumber())
			{
				throw new InvalidTelephoneNumberException();
			}
		}
		catch(InvalidTelephoneNumberException e)
		{
			System.out.println("Invalid Telephone");
			return;
		}
		Dis();
	}
	void Dis()
	{
		System.out.println("Name of The Employee : " + name);
		System.out.println("Email of the Employee: " + email);
		System.out.println("Phone of the Employee: " + phone);
	}
	boolean validEmail()
	{
		if(email.indexOf('@')!=-1)
		{
			if(email.indexOf('.',email.indexOf('@'))!=-1)
			{
				return true;
			}
		}
		return false;
	}
	boolean validPhoneNumber()
	{
		if(phone.length()==10)
		{
			for (char c : phone.toCharArray()) 
			{
				if (!Character.isDigit(c))
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}
}

class u6p3
{
	public static void main(String Args[])
	{
		Employee e1 = new Employee();
		e1.setValue();
	}
}
