
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,9,12,1,98,34,2};
		print(arr);
        //bubbleSort(arr);
       // print(arr);
		//bubbleSort(arr);
		//insertionSort(arr);
		print(mergeSort(arr));
	}

	private static int[] mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		
		
		
		int n=arr.length;
		if(n<=1)
			return arr;
		int[] first=new int[n/2];
		int[] second=new int[n-first.length];
		System.arraycopy(arr, 0, first, 0, first.length);
		
		System.arraycopy(arr, first.length, second, 0, second.length);
		
		mergeSort(first);
		mergeSort(second);
		merge(first,second,arr);
		
		
		return arr;
		
		
		
		
		
	}
	
	private static int[] merge(int[] first, int[] second,int[] arr) {
		// TODO Auto-generated method stub
	
		
		
		int i=0,j=0,k=0;
		while(i<first.length&&j<second.length)
		{
			if(first[i]<second[j])
				{arr[k]=first[i];
				 i++;
				}
			else{
				arr[k]=second[j];
				j++;
			}
			k++;
		}
		System.arraycopy(first, i, arr, k, first.length-i);
		System.arraycopy(second, j, arr, k, second.length-j);
		//System.arraycopy()
		return arr;
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=1;i<n;i++)
		{  int val=arr[i];
		   int j=i;
		   while(j>0&&arr[j-1]>val)
		   {
			   arr[j]=arr[j-1];
			   j=j-1;
		   }
			arr[j]=val;
		}
		
		print(arr);
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		print(arr); 
	}

	private static void normalSort(int[] arr) {
		// TODO Auto-generated method stub
	int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{ int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				  
					
				}
			}
		}
		print(arr);
		
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
	}

}
