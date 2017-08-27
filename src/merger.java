
public class merger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={3,5,7}; int temp;
		int[] arr2=new int[6];
		for(int i=0;i<3;i++)
			{arr2[i]=(i+1)*(i+1);
			}
		int k=2*(arr1.length)-1;
		int i=arr1.length-1;int j=arr2.length/2-1;
	  while(k>=0)
	  { System.out.println("inside");
		  if(arr1[i]>arr2[j])
		    {
			  arr2[k]=arr1[i]; 
		    
		    
		    i--;}
		  else{
			 arr2[k]=arr2[j];
			  j--;
			  
		  }
		 k--; 
		  
		 System.out.println(arr2[k]); 
	  }
	for(int l=0;l<arr2.length;l++)
		System.out.println(arr2[l]);
	
	}


		
}
