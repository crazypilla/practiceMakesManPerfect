
public class maxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={-2,11,-4,5,-5,2};
		int[] arr2={-1,-3,-4,-2,-1,-6};
		System.out.println(maxConti(arr1));
		System.out.println(maxConti(arr2));
	}

	private static int maxConti(int[] arr) {
		// TODO Auto-generated method stub
		//return null;
		int sum=0;
		int maxValue=arr[0];
		int start=0;int end=0;
		for(int i=0;i<arr.length;i++)
		{  
			sum=Math.max(sum+arr[i], arr[i]);
			
			
			maxValue=Math.max(maxValue,sum);
			
		}
		System.out.println(start+" "+end);
		return maxValue;
	}

}
