package lab3;
import java.util.Scanner;
public class Mirrorstring 
{
	public String getImage(String str)
	{
		StringBuffer sbr = new StringBuffer(str);
		sbr.append('|');
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}
	public static void main(String[]args)
	{
		Mirrorstring st = new Mirrorstring();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		System.out.println(st.getImage(str));
	}

}
