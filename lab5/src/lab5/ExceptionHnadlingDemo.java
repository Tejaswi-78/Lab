package lab5;
import java.util.Scanner;
public class ExceptionHnadlingDemo
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		try 
		{
			if(age<18)
			{
				throw new InvalidAge("Enter age greater than 18:");
			}
			else
				System.out.println("valid age");
		}
	   catch (Exception e)
	   {
	    	e.printStackTrace();
	   }
    }
}
