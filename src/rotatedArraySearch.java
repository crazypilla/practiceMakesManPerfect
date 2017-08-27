
public class rotatedArraySearch {

	public static void main(String[] args)
	{
		int[] arr={36,45,54,63,9,18,27};
		
		System.out.println(search(arr,54));
	}

	private static int search(int[] arr, int data) {
		// TODO Auto-generated method stub
		//return null;
		int pivot=findPivot(arr,0,arr.length-1);
		//System.out.println(pivot);
		if(data>=arr[pivot])
		{
			return binarySearch(arr,pivot+1,arr.length-1,data);
			
		}
		else{
			return binarySearch(arr,0,pivot-1,data);
		}
		
	}

	private static int binarySearch(int[] arr, int left, int right, int data) {
		// TODO Auto-generated method stub
		//return 0;
		
		if(left>right)
			return -1;
		else{
			
			while(left<=right)
			{
			   int mid=left+(right-left)/2;
			   if(arr[mid]==data)
				   return mid;
			   else{
				   
				   if(data<arr[mid])
				   {
					   return binarySearch(arr,left,mid-1,data);
				   }
				   else{
					  return  binarySearch(arr,mid+1,right,data);
				   }
				   
			   }
				
			}
		}
		return -1;
		
	}

	private static int findPivot(int[] arr, int start, int finish) {
		// TODO Auto-generated method stub
	//	return 0;
		if(start==finish)
			return start;
		else if(start==finish-1)
		{
			if(arr[start]>=arr[finish])
				{return start;}
			else
				{return finish;}
		}
		else{
			while(start<=finish)
			{
				int mid=start+(finish-start)/2;
				if(arr[start]>=arr[mid])
				{
					return findPivot(arr,start,mid);
				}
				else{
					return findPivot(arr,mid,finish);
				}
			//	return -1;
			}
		}
	return finish;
	}
}
