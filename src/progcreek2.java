
public class progcreek2 {
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6};
		int target=6;
		int i=0; int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]+arr[j]>target)
			{
				j--;
			}
			else if(arr[i]+arr[j]<target)
			{
				i++;
			}
			
			else{
				System.out.println(arr[i]+","+arr[j]);
				//break;
				i++;
				j--;
			}
			
		}
		
		
	}

}
