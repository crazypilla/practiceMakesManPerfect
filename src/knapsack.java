import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double[] wt={1,3,4,5};
      double[] val={1,4,5,7};
      double cap=7;
      System.out.println("fractional and Greedy Approach: "+fractionalKnapsack(wt,val,cap));
      System.out.println("Dynamic Approach: "+dynamicKnapSack(wt,val,cap));
	}

	private static double dynamicKnapSack(double[] wt, double[] val, double cap) {
		// TODO Auto-generated method stub
		//return null;
	
	//double
	
	int rows=val.length;
	int columns=(int)cap+1;
	int[][] table=new int[rows][columns];
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			if(j==0)
			{
				table[i][j]=0;
				
			}
			else{
				 // System.out.println(j);
				//  System.out.println(rows);
				//  System.out.println(wt[j]);
				  if(i>0&&j>=(int)wt[i])
				  { table[i][j]=Math.max(table[i-1][j], table[i-1][j-(int)wt[i]]+(int)val[i]);
				    System.out.println("updated");
				   
				  }
				//}
				
			}
			
		}
	}
	
//table[n][j]
		int max=0;
		for(int i=0;i<rows;i++)
		{
			if(table[i][columns-1]>max)
			{max=table[i][columns-1];}
		}
	
     return max;
	
	}

	private static double fractionalKnapsack(double[] wt, double[] val, double cap) {
		// TODO Auto-generated method stub
		//return null;
		//int[] wtByVal=new int[wt.length];
		TreeMap<Double,Integer> wtByValMap=new TreeMap<>();
		for(int i=0;i<wt.length;i++)
		{
			double wtByVal=wt[i]/val[i];
			wtByValMap.put(wtByVal, i);
		}
	
		//int i=0;
		int initCap=0;
		double maxVal=0;
		
		for(Map.Entry<Double,Integer> e:wtByValMap.entrySet())
		{
			
			
			double newWt=initCap+wt[e.getValue()];
			if(newWt<cap)
			{   //initCap+=newWt;
				maxVal+=val[e.getValue()];
			}
			else if(newWt==cap)
			{  //initCap=newWt;
				maxVal+=val[e.getValue()];
				return maxVal;
			}
			
			else{
				
				double diff=newWt-cap;
				double lastCap=wt[e.getValue()]-diff;
				double lastVal=val[e.getValue()]*lastCap/wt[e.getValue()];
				maxVal+=lastVal;
				
				return maxVal;
				
				
			}
			initCap+=newWt;
		}
		System.out.println(initCap);
		
		return maxVal;
			
		}
		
	}


