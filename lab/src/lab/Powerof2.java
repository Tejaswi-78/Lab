package lab;
import java.util.Scanner;
public class Powerof2 {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n value:");
		int n = sc.nextInt();
		boolean status = false;
		for(int i=1;i<=n/2;i++)
		{
			if(i*i==n)
			{
				status = true;
				break;
			}
		}
		if(status)
		{
			System.out.println(n+"is power of 2");
		}
		else
			System.out.println(n+"is not  power of 2");
		
		
	}

}
