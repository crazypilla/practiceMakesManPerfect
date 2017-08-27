
public class lcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="abcdaf";
		String y="acbcf";
		System.out.println(lcs(x,y));

	}

	private static int lcs(String x, String y) {
		// TODO Auto-generated method stub
		//return null;
		if(x==null&&y==null)
			return 0;
		int m=x.length();
		int n=y.length();
		int[][] table=new int[x.length()+1][y.length()+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<n;j++)
			{ table[i][j]=0;}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				
{   System.out.println(x.charAt(i)+" "+y.charAt(j));
		    
			if(x.charAt(i)==y.charAt(j))
			{ 
				table[i+1][j+1]=table[i][j]+1;
				
			}
			else{
				 table[i+1][j+1]=Math.max(table[i][j+1],table[i+1][j]);
			}
			
			
		}
			
			
		}
		printLcs(x,y,table);
		return table[m][n];
	}

	private static void printLcs(String x,String y,int[][] table) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		int xlen=x.length();
		int ylen=y.length();
		while(xlen!=0&&ylen!=0)
		{
			if(table[xlen][ylen]==table[xlen-1][ylen])
				{xlen--;}
			else if(table[xlen][ylen]==table[xlen][ylen-1])
			    {ylen--;}
			else{
				
				if(x.charAt(xlen-1)==y.charAt(ylen-1))
				{
					sb.append(x.charAt(xlen-1));
					xlen--;
					ylen--;
				}
			}
			
		}
		System.out.println(sb.reverse().toString());
	}

}
