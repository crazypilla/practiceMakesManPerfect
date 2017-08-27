
public class rotateByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		int k=2;
		print(rotateByK(arr,0,arr.length-1, k));

	}
	private static int[] rotateByK(int[] arr,int start,int end,int k) {
		// TODO Auto-generated method stub
	//	int end=arr.length-1;
		if(start>=arr.length)
		{return arr;}
		if(start+k>=arr.length)
			{return arr;}
		
		for(int i=start;i<k+start;i++)
		{
			int temp=arr[i];
			arr[i]=arr[end-k];
			arr[end-k]=temp;
		}
		//print(arr);
		//if(start=start+k)
		start=start+k;
		if(start<arr.length)
		{ rotateByK(arr,start,end,k);}
		return arr;
		}
		
		
		//return arr;
	//}
//}
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{System.out.println(arr[i]);}
	}

}
