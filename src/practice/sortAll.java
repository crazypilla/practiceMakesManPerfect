package practice;

public class sortAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={34,2,5,45,15,10};
		//sortNaive(arr);
		//selectionSort(arr);
	//	mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		
		
		
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		//int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++)
		{   
			int min=findMin(arr,i+1);	
			swap(arr,min,i);
			
		}
		
	}

	private static void swap(int[] arr, int min, int i) {
		// TODO Auto-generated method stub
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
		
	}

	private static int findMin(int[] arr, int start) {
		// TODO Auto-generated method stub
		//return 0;
		int min=arr[start];
		int minIndex=start;
		for(int i=start+1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				minIndex=i;
			}
		}
		
		return minIndex;
	}

	private static void sortNaive(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{ if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
				
			}
		}
		
	}

}
