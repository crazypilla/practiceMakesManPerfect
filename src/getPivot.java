
public class getPivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={23,34,56,78,35,21,9};
		int i=0;
		int j=arr.length-1;
		while(i<=j)
		{    
			if(i==j)
			{
				System.out.println(arr[i]);
				return;
			}
			if(i==j-1)
			{
				System.out.println(Math.max(arr[i], arr[j]));
				return;
			}
			else{
				
				int mid=i+(j-i)/2;
				if((arr[mid-1]<arr[mid])&&(arr[mid]>arr[mid+1]))
				{
					System.out.println(arr[mid]);
					return;
				}
				else if((arr[mid-1]<arr[mid])&&(arr[mid]<arr[mid+1]))	
				{
					i++;
				}
				else if((arr[mid-1]>arr[mid])&&(arr[mid]>arr[mid+1]))
				{ j--;
					
				}
				
			}
			
		}

	}

}
