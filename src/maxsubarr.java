import java.util.Arrays;

public class maxsubarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={3,3,9,9,5};
		for(int k=0;k<5;k++)
		{
			arr[k]=arr[k]%7;
		}
		Arrays.sort(arr);
		int m=7;
		int left=0;
        int maxSum=0;
        int sum=0;
        int n=5;
        int i=0;
      //  Arrays.sort(arr);
        while(i<n&&left<n)
            {
            sum+=arr[i];
           
            if(sum>=m)
                {
                 
                 sum=sum-arr[left];
                  
                 left++; 
                }
            else{
               // sum 
                
                i++;
            }
            if(sum>maxSum && sum<m)
                {
                maxSum=sum;
            }
        }
        System.out.println(maxSum);

	}

}
