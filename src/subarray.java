
public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,2,3,4,5};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.print("("+arr[i]+" ,"+arr[j]+"),");
			}
		}
		System.out.println();
		System.out.println();
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("("+arr[j]+" ,"+arr[i]+"),");
			}
		}

	}

}
