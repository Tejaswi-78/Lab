package LambdaPrograms;
interface intf{
	void swapping(int a , int b);
}
public class Swapping {
	public static void main(String[]args)
	{
		int x = 10;
		int y = 30;
		int temp=x;
		System.out.println("After Swapping");
		intf Intf=(int a,int b)->{
			a=b;
			b=temp;
			System.out.println("1st num is:"+a);
			System.out.println("2nd num is :"+b);
		};
		Intf.swapping(x,y);
	}

}
