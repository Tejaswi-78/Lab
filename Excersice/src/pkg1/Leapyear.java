package pkg1;

public class Leapyear {
	public static void main(String[]args)
{
	int year = 2020;
	if(year%400==0||year%100==0||year%4==0)
	{
		System.out.println("given year is leap year");
	}
	else
	{
		System.out.println("given year is not leap year");
	}
}

}
