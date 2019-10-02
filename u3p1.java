/*Write a simple java application that defines a class Student with
roll_no(int), name(String),address(String) & branch(String) as data fields. The
class should have getData() & showData() methods. The program should create
an array of Student object, get the details and display it. */
import java.util.Scanner;

class Student
{
	int roll_no;
	String name;
	String address;
	String branch;
	
	void getdata()
	{
		String temp; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Enrollment :");
		roll_no = s.nextInt();
		temp = s.nextLine();
		System.out.print("Enter the Name :");
		name = s.nextLine();
		System.out.print("Enter the Address :");
		address = s.nextLine();
		System.out.print("Enter the Branch :");
		branch = s.nextLine();
	}
	
	void showdata()
	{
		System.out.println("\tThe Enrollment \t" + roll_no);
		System.out.println("\tThe Name \t" + name);
		System.out.println("\tThe Address    \t" + address);
		System.out.println("\tThe Branch \t" + branch);
	}
}

class u3p1
{
	public static void main(String args[])
	{
		Student s1[] = new Student[3];
		for (int i = 0; i < 3; i++)
		{
			s1[i] = new Student();
			s1[i].getdata();
			s1[i].showdata();
		}
		
	}
}
