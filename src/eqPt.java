import java.util.ArrayList;

public class eqPt {
	public static void main(String[] args)
	{
		int[] arr={-7,1,5,2,-4,3,0};
		ArrayList<Integer> list=new ArrayList<>();
		int leftSum=0;
		int rightSum=0;
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			rightSum+=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			rightSum-=arr[i];
			System.out.println(leftSum+" , "+rightSum);
			if(leftSum==rightSum)
			   {list.add(i);}
			
			leftSum+=arr[i];
		}
		System.out.println(list);
	}

}
