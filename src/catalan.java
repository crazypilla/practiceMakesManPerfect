
public class catalan {
	static int n=3;
	static int[] table=new int[n+1];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=3;
		for(int i=0;i<=n;i++)
		{table[i]=1;}
		System.out.println(catalan(n));
		

	}

	private static int catalan(int n) {
		// TODO Auto-generated method stub
		//return null;
	        if(n==0)
	        	return 1;
			
			if(table[n]!=1)
				return table[n];
			table[n]=0;
			
			for(int i=1;i<=n;i++)
			{  
				table[n]+=catalan(i-1)*catalan(n-i);
			}
			return table[n];
			
		
	}

}
