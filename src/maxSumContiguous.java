
public class maxSumContiguous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={-1,-2,-3,-4};
		System.out.println(getNonContiguousSum(arr));

	}
	 public static int getNonContiguousSum(int[] arr)
     { int sum=0;
      int minNegative=Integer.MAX_VALUE;
      boolean allNegs=true;
     for(int i=0;i<arr.length;i++)
         {
         if(arr[i]>=0)
             { allNegs=false;
             sum+=arr[i];
         }
         if(arr[i]<minNegative)
             { minNegative=arr[i];
             }
     }
      if(allNegs)
          {return minNegative;}
      return sum;
     
 }

}
