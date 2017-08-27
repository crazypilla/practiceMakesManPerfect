
public class maxContSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={};
		System.out.println(maxSum(arr));

	}

	private static int maxSum (int[] arr) 
	{
		// TODO Auto-generated method stub
	try{
		int sumSoFar=arr[0];
		int maxSum=arr[0];
		int maxEndingHere=0;
		int maxStartsHere=0;
		for(int i=1;i<arr.length;i++)
		{
			if(sumSoFar+arr[i]<arr[i])
			{
				sumSoFar=arr[i];
				maxStartsHere=i;
			}
			else{
				sumSoFar+=arr[i];
			}
			if(maxSum<sumSoFar)
				maxSum=sumSoFar;
			    maxEndingHere=i;
			
		}
		System.out.println(maxStartsHere+"    "+maxEndingHere);
        return maxSum;
        
	}catch(Exception e){
		
		System.out.println("empty array");
	}
	return 0;
	}

}

