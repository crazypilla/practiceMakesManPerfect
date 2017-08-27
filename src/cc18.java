
public class cc18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][] arr={{1,2,0,4},{5,0,7,8},{9,10,11,12},{13,14,0,16},{17,18,19,20}};
      int[][] newmat=new int[arr.length][arr[0].length];
      System.out.println("Before :");
    print(arr);
      
      
      System.out.println("After: ");
      for(int i=0;i<arr.length;i++)

      {
    	  for(int j=0;j<arr[0].length;j++)
    	  {
    		  if(arr[i][j]==0)
    		  {
    			  putZeros(newmat,i,j);
    		  }
    		 else  
    		 {
    			 newmat[i][j]=arr[i][j];
    		 }
    	  }
      }
      
      
      //System.out.println("Before :");
    print(newmat);
      
      
      
      
      
	}

	private static void print(int[][] newarr) {
		// TODO Auto-generated method stub
		  for(int i=0;i<newarr.length;i++)
	      {for(int j=0;j<newarr[0].length;j++)
	      {
	    	  System.out.print(newarr[i][j]+" ");
	      }
	    	 System.out.println(); 
	      }
	      
	}

	private static void putZeros(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		for(int col=0;col<arr[0].length;col++)
		{
			arr[i][col]=0;
		}
		for(int row=0;row<arr.length;row++)
		{
			arr[row][j]=0;
		}
		
	}

}
