package LambdaPrograms;
import java.util.Arrays;
interface Intf{
	void second(int[]a);
}
public class SecondHighest {
	public static void main(String[]args)
	{
		int[]arr = {11,29,31,45,5};
		Intf intf=(int[]a) ->{
			Arrays.sort(arr);
			System.out.println("Second highest number in the given array is:"+arr[arr.length-2]);
		};
		intf.second(arr);
			
		}
	}

