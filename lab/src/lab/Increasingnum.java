package lab;
import java.util.Scanner;
public class Increasingnum {
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number:");
	int n = sc.nextInt();
	boolean flag = false;
	int currentDigit = n%10;
	n=n/10;
	while(n>0)
	{
		if(currentDigit<=n%10)
		{
			flag = true;
			break;
		}
		currentDigit = n%10;
		n=n/10;
	}
	if(flag)
	{
		System.out.println("digits are not in increasing order");
	}
	else
		System.out.println("digits are in increasing order");
	}
}

