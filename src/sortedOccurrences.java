
public class sortedOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,4,5,5,6,6,6,7,7,8};
		System.out.println(occurrences(arr,6));
		System.out.println(firstOcc(arr,0,arr.length-1,6));
		System.out.println(lastOcc(arr,0,arr.length-1,6));
		

	}

	private static int lastOcc(int[] arr,int left,int right,int data) {
		// TODO Auto-generated method stub
		//return null;
		
		if(left>right)
			return -1;
		else{
			
			
			while(left<=right)
			{
				
				int mid=left+(right-left)/2;
				if((arr[mid]==data && mid==right)||(arr[mid]==data && arr[mid+1]>arr[mid]))
				{return mid;}
				else if(data<arr[mid])
				{
					return lastOcc(arr,left,mid-1,data);
				}
				else{
					return lastOcc(arr,mid+1,right,data);
				}
				
			}
			
			
		}
		return -1;
		
	}

	private static int firstOcc(int[] arr,int left,int right, int data) {
		// TODO Auto-generated method stub
		//return null;
		
		if(left>right)
			return -1;
		else{
			
			
			while(left<=right)
			{
				
				int mid=left+(right-left)/2;
				if((arr[mid]==data && mid==left)||(arr[mid]==data && arr[mid-1]<arr[mid]))
				{return mid;}
				else if(data<=arr[mid])
				{
					return firstOcc(arr,left,mid-1,data);
				}
				else{
					return firstOcc(arr,mid+1,right,data);
				}
				
			}
			
			
		}
		return -1;
		
		
		
	}

	private static int occurrences(int[] arr, int data) {
		// TODO Auto-generated method stub
		//return null;
		int index=binarySearch(arr,0,arr.length-1,data);
		System.out.println(index);
		int leftCount=0;
		int rightCount=0;
		if(index>=0)
		{
			int temp=index-1;
			while(temp>=0)
			{
				if(arr[temp]==data)
				{
					leftCount++;
				}
				temp--;
			}
			int temp2=index+1;
			while(temp2<=arr.length-1)
			{
				if(arr[temp2]==data)
				{
					rightCount++;
				}
				temp2++;
			}
			
		return (leftCount+rightCount+1)	;
		}
		
		return -1;
		
	}

	private static int binarySearch(int[] arr, int left,int right,int data) {
		// TODO Auto-generated method stub
		
	  if(left>right)
		  return -1;
	  else{
		  
		  while(left<=right)
		  {
			  
			  int mid=left+(right-left)/2;
			  if(arr[mid]==data)
			  {
				  return mid;
			  }
			  else if(data<arr[mid])
			  {
				  return binarySearch(arr,0,mid-1,data);
			  }
			  
			  else{
				  return binarySearch(arr,mid+1,arr.length-1,data);
			  }
		  }
		   
		  
	  }
	return -1;
		//return 0;
	}

}
