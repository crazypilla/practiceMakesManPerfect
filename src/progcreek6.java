import java.util.ArrayList;
import java.util.Arrays;

public class progcreek6 {
	public static void main(String[] args)
	{
		int[] arr={-1,2,1,-4};
		int target=1; int min=Integer.MAX_VALUE; int res=0;
		ArrayList<Integer> result=new ArrayList<>();
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++)
		{
			
			int j=i+1;
			int k=arr.length-1;
			while(j<k)
			{
				
				 int sum=arr[i]+arr[j]+arr[k];
					
					int diff=Math.abs(sum-target);
					if(diff==0)
					{  result.clear();
						System.out.println(sum);
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
						result.add(arr[i]);
						result.add(arr[j]);
						result.add(arr[k]);
						
					}
					if(diff<min)
					{   min=diff;
						res=sum;
						result.clear();
						result.add(arr[i]);
						result.add(arr[j]);
						result.add(arr[k]);
					}
					 if(sum<=target)
						 j++;
					 else{
						 k--;
					 }
					
				}
				
				
		
	
		}
	 System.out.println(res);
	 System.out.println(result);
	}

}
