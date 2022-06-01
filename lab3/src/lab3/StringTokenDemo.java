package lab3;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenDemo 
   {
	public static void main(String[]args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("enter line of numbers:");
	   String input = sc.nextLine();
	   StringTokenizer a = new StringTokenizer(",");
	   int sum = 0;
	   while(a.hasMoreTokens())
	   {
		   int n =Integer.parseInt(a.nextToken());
		   System.out.println("Number is:"+n);
		   sum+=n;  
       }
	   System.out.println("sum of the numbers is:"+sum);
   }

}
