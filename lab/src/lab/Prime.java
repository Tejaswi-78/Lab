package lab;
import java.util.Scanner;
public class Prime {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the n value:");
		int n = sc.nextInt();
		boolean isprime = true;
		for(int i = 2;i<=n;i++)
		{
			if(n%i==0)
			{
				isprime = false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println(n+"is a prime number");
		}
		else
			System.out.println(n+"is not a prime number");
	}

}
