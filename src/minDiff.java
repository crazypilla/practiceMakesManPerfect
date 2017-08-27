
public class minDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,4,5,7};
		int[] arr2={9,10,11,12,13};
		int[] res=new int[2];
		int minDiff=Integer.MAX_VALUE;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				int diff=Math.abs(arr1[i]-arr2[j]);
				if(diff<minDiff)
				{
					minDiff=diff;
					res[0]=i;
					res[1]=j;
					
				}
			}
		}
		System.out.println(arr1[res[0]]+"   "+arr2[res[1]]+" diff is:  "+minDiff);
		
		System.out.println("method 2:   ");
		int i=0; 
		int j=0;
		int m=arr1.length;
		int n=arr2.length;
		int minDiff2=Integer.MAX_VALUE;
		while(i<m-1 && j<n-1)
		{   int diff1=Math.abs(arr1[i+1]-arr2[j]);
		    int diff2=Math.abs(arr1[i]-arr2[j+1]);
			if(diff1<diff2)
			{  
				
				if(diff1<minDiff2)
				{   
					res[0]=i+1;
					res[1]=j;
					minDiff2=diff1;
				}
				i++;
			}
			else {
				
				
				if(diff2<minDiff2)
				{   
					res[0]=i;
					res[1]=j+1;
					minDiff2=diff2;
				}
				j++;
			}
		}
		
		System.out.println(arr1[res[0]]+"   "+arr2[res[1]]+" diff is:  "+minDiff2);

	}

}
