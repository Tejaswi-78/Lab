package pkg1;

public class Swap {
	public static void main(String[]args)
	{
		int a = 5;
		int b =9;
		System.out.println("before swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		int c = a;
		a=b;
		b=c;
		System.out.println("after swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
