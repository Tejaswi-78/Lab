package lab5;
import java.util.Scanner;
public class EmployeeException {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee salary:");
		int salary = sc.nextInt();
		try
		{
			if(salary < 3000)
			{
				throw new InvalidAge("Employtee salary is above 3000");
			}
			else
			{
				System.out.println("Employee salary is valid");
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}


