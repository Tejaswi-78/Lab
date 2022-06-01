package lab5;
import java.util.Scanner;
public class ExceptionName {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		String firstname = sc.nextLine();
		System.out.println("Enter last name:");
		String lastname = sc.nextLine();
		try {
			if((firstname.length()==0)&&(lastname.length()==0))
				throw new InvalidName("invalid Character");
			else
				System.out.println("valid name");
		}
		catch (Exception e)
		{
			e.printStackTrace();
				
		}
	}

}
