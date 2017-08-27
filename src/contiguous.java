
public class contiguous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={-2,-8,-3,-2,-4,-10};
        System.out.println(getMaxSum(arr));
	}

	private static int getMaxSum(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length==0)
			return Integer.MIN_VALUE;
		int currSum=arr[0];
		int maxSum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(currSum+arr[i]>arr[i])
			{
				currSum+=arr[i];
			}
			else{
				currSum=arr[i];
			}
			if(currSum>maxSum)
			{
				maxSum=currSum;
			}
		}
		return maxSum;
	}

}
