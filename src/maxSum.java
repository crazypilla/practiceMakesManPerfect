
public class maxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,3,-1,-3,5,3,6,7};
        int w=3;
        System.out.println(findMaxSum(A,w));
	}

	private static int findMaxSum(int[] a, int w) {
		// TODO Auto-generated method stub
		
		int maxSum=Integer.MIN_VALUE;int currSum=0;
		for(int i=0;i<=a.length-w;i++)
		{  currSum=0;
			for(int j=i;j<i+w;j++)
			{   
				currSum+=a[j];
				
			}
			//System.out.println(currSum
					//);
			if(currSum>maxSum){
				maxSum=currSum;
			}
		}
		return maxSum;
		
	}

}
