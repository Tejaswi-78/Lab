package lab;
import java.util.Scanner;
public class Difference
{
	public static void calculateDifference(int n)
	{
		int sum =0,sum1=0,sum2=0;
		for(int i = 1;i<=n;i++)
		{
			sum+=(i*i);
		}
		System.out.println("The square of the summation number is"+sum);
		for(int i = 1;i<=n;i++)
		{
			sum1+=i;
		}
		sum2+=(sum1*sum1);
		System.out.println("The sum of square is"+sum2);
		int difference = sum-sum2;
		System.out.println(difference);
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value:");
		int n = sc.nextInt();
		calculateDifference(n);
	}

}
