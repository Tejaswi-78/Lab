package lab;
import java.util.Scanner;
public class Natural {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = sc.nextInt();
		System.out.println("enter the n value:");
		int n = sc.nextInt();
		int sum = 0;
		{
			for(int i = m;i<=n;i++)
			{
					if(i%3==0||i%5==0)
					{
						sum=sum+i;
			}
			}
			
			           System.out.println(sum);
			}
		}
}
