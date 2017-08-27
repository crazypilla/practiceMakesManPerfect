
public class DNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,1,0,1,2,1,2,0,0,0,0,1};
		print(DNFSort(arr));

	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		//return null;
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]);
				}
	}

	private static int[] DNFSort(int[] arr) {
		// TODO Auto-generated method stub
		
		int low=0;int high=arr.length-1;int mid=0;
		
		while(mid<=high)
		{ switch(arr[mid])
			{
		case 0:
			swap(arr,low,mid);
			low++;
			mid++;
			break;
	
			
		case 1:
			mid++;
			break;
			
	
		//}
		
		case 2:
			swap(arr,mid,high);
			high--;
			break;
		
			}
		}
		
		
	return arr;	
		
	}

	private static void swap(int[] arr, int first, int scnd) {
		// TODO Auto-generated method stub
		int temp=arr[first];
		arr[first]=arr[scnd];
		arr[scnd]=temp;
		
	}

}
