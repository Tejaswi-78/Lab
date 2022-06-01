package lab2;

public class Smallestnum
{
	public static void main(String[]args)
	{
		int temp,size;
		int array[]= {10,20,25,30,36};
		size = array.length;
		for(int i=0;i<size;i++)
		{
			for(int j = i+1;j<size;i++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("second smallest element of the array is:"+array[0]);
	}

}
