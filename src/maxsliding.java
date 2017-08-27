
public class maxsliding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,-1,-3,5,3,6,7,1,5};
		int w=3;
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<w;i++)
		{
			sum+=arr[i];
			
		}
		maxSum=sum;
		int maxi=0;
        for(int i=w;i<arr.length;i++)
        {
        	sum=sum-arr[i-w]+arr[i];
        	
        	if(sum >maxSum)
        	{
        		maxSum=sum;
        		maxi=i;
        	}
        	
        	
        	
        }
        
        System.out.println(maxi+"   "+maxSum);
	}

}
