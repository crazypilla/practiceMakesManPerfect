import java.util.ArrayList;
import java.util.Arrays;

public class progcreek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={0,1,4,-1,2,-1,-1
				};
		//int i=0;
		int len=arr.length;
	//	int j=len-1;
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<len-2;i++)
		{
			
			
			if(i==0||arr[i]>arr[i-1])
			{  int j=i+1;
			   int k=len-1;
				while(j<k)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						ArrayList<Integer> list=new ArrayList<>();
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
						res.add(list);
						j++;
						k--;
						/*while(j<k&&arr[j]==arr[j-1])
							 j++;
						while(j<k&&arr[k]==arr[k+1])
							 k--;
						*/
					}
					
					else if(arr[i]+arr[j]+arr[k]<0)
					{
						j++;
					}
					else{
						k--;
					}
				}
				
			}		
			
		}
		
		
		System.out.println(res);
	}

}
