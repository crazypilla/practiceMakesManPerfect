import java.util.*;
 
class costDp
{
    /* A utility function that returns minimum of 3 integers */
    private static int min(int x, int y, int z)
    {
        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }
 
    private static int minCost(int cost[][], int m, int n)
    {
        int i, j;
        int tc[][]=new int[m+1][n+1];
        int path[][]=new int[m+1][n+1];
        tc[0][0] = cost[0][0];
        
        for( i=1;i<=m;i++)
        {
        	for( j=1;j<=n;j++)
        	{
        		path[i][j]=0;
        	}
        }
 
        /* Initialize first column of total cost(tc) array */
        for (i = 1; i <= m; i++)
            tc[i][0] = tc[i-1][0] + cost[i][0];
 
        /* Initialize first row of tc array */
        for (j = 1; j <= n; j++)
            tc[0][j] = tc[0][j-1] + cost[0][j];
 
        /* Construct rest of the tc array */
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
            { 
         	
            	int minVal = min(tc[i-1][j-1], 
                               tc[i-1][j],
                               tc[i][j-1]) ;
            	if(minVal==tc[i-1][j])
            		path[i-1][j]=1;
            	if(minVal==tc[i-1][j-1])
            		path[i-1][j-1]=1;
            	if(minVal==tc[i][j-1])
            		path[i][j-1]=1;
            	
            	tc[i][j]=minVal+cost[i][j];
          
            }
        print(path,tc);
 
        return tc[m][n];
    }
 
    private static void print(int[][] path,int[][] tc) {
		// TODO Auto-generated method stub
    	System.out.println("printing path.... ");
    	for(int i=0;i<path.length;i++)
    	{
    		for(int j=0;j<path[0].length;j++)
    		{
    			if((i<path.length-1&&path[i+1][j]==1))
    				{
    				
    				System.out.println(i+"  "+j+"goes to"+ (i+1) +"  "+j);
    				
    				
    				}
    			else if(j<path[0].length-1&&path[i][j+1]==1)
    					{
    					System.out.println(i+"  "+j+"goes to"+(i)+"  "+(j+1));
    					}
    			else if(i<path.length-1&&j<path[0].length-1&&path[i+1][j+1]==0)
    			{
    				System.out.println(i+"  "+j+"goes to"+
    			            (i+1)+"   "+(j+1));
    			}
    		}
    	}
    	/*int i=path.length;int j=path[0].length;
    	while(i>0&&j>0)
    	{
    		if(path[i-1][j]==1||path[i][j-1]==0||path[i-1][j-1]==0)
    		{
    			System.out.println(i+"   "+j);
    		}
    	}
		*/
	}

	/* Driver program to test above functions */
    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                       {4, 8, 2},
                       {1, 5, 3}};
        System.out.println("minimum cost to reach (2,2) = " +
                                         minCost(cost,2,2));
    }
}
