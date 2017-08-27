
public class coinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int total=13;
      int[] coins={7,2,3,6};
      int[] A=new int[total+1];
      int[] B=new int[total+1];
      for(int i=0;i<=total;i++)
      {A[i]=Integer.MAX_VALUE-1;}
      A[0]=0;
      for(int i=1;i<=total;i++)
      {
    	  B[i]=-1;
      }
      boolean just=false;
      for(int j=0;j<coins.length;j++)
      {
    	  for(int i=0;i<=total;i++)
    	  {
    		  
    		  if(i>=coins[j])
    		  {  
    		  
    			
    		    	
    		    	if(A[i]>A[i-coins[j]]+1)
    		    	{   just=true;
    		    	   // System.out.println(i);
    		    	   //System.out.println("hjg");
    		    	}
    		    	A[i]=Math.min(A[i],1+A[i-coins[j]]);
    		    	//System.out.println(A[i]);
    			}
    			//System.out.println(A[i]);
    		    if(just)
    		    {
    		    	B[i]=j;
    		    //	System.out.println(i+" "+coins[j]);
    		    }
    		    just=false;
    				 
    		  	  
    	  }
      }
      
      System.out.println(A[total]+" coins can be used to achieve a total of : "+total);
      printCoins(B,coins);
	}

	private static void printCoins(int[] b, int[] coins) {
		// TODO Auto-generated method stub
		
		if(b[b.length-1]==-1)
		{
			System.out.println("sorry boss no soln possible");
		}
		System.out.print("coins used are: ");
		int start=b.length-1;
		while(start!=0)
		{   int x=b[start];
			System.out.print(coins[x]+"  ");
			start=start-coins[x];
		}
	}

}
