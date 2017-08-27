
public class progcreek11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr={1,2,3,4,5,6,7};
       int k=3;
       rotateByK(arr,0,k);
       for(int i=0;i<arr.length;i++)
       {System.out.print(arr[i]+" ,");
         
       }
      
	}

	private static void rotateByK(int[] arr, int start, int k)
	{
		// TODO Auto-generated method stub
		int n=arr.length-start;
		//System.out.println();
		if(n>k)
		{
			for(int i=start;i<k+start;i++)
			{
				int temp=arr[i];
				arr[i]=arr[n+i-k];
				arr[n+i-k]=temp;
			 }
			
			rotateByK(arr,start+k,k);
		}
		 
		 
	}

}
