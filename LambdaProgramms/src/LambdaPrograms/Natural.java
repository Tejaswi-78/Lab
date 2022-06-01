package LambdaPrograms;
import java.util.*;
interface Intf1
{
	int sum(int n );
}
public class Natural
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the value:");
			int n = sc.nextInt();
			
			Intf1 intf=(int m )->{
				return n*(n+1)/2;
			};
			System.out.println("The sum of "+n+"natural numbers is:"+intf.sum(n));
				
			}
	}

