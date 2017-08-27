
public class dpDSMadeEasy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		System.out.println(rec(n));

	}

	private static int rec(int n) {
		// TODO Auto-generated method stub
		//return null;
		 int[] tab=new int[n+1];
		 tab[0]=2;
		 tab[1]=2;
		 int count=0;
		 for(int i=1;i<n;i++)
		 {
			 count+=2*tab[i-1]*tab[i];
			 tab[i+1]=count;
		 }
		
		return tab[n];
		
		
	}

}
