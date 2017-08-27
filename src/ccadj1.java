import java.math.*;
public class ccadj1 {
public static void main(String[] args)
{
	int[] arr={23,56,2,4,5,16,78,77,-4,-3};
	
	for(int i=1;i<arr.length;i++)
	{
		int diff= Math.abs(arr[i]-arr[i-1]);
		if(diff==1)
			{System.out.println(arr[i-1]+","+arr[i]);}
	}
	
	
	}
}
