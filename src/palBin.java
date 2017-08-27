
public class palBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		String s=Integer.toBinaryString(n);
		System.out.println(isPal(s));

	}

	private static boolean isPal(String s) {
		// TODO Auto-generated method stub
		//return null;
		String r;
		if(s==null)
			return true;
		else{
			
			if(s.length()%2==0)
			{
			 r=new StringBuilder(s.substring(s.length()/2)).reverse().toString();
			    //if()
			 
			
			}
			else{
				 r=new StringBuilder(s.substring(s.length()/2+1)).reverse().toString();
			}
			System.out.println(r);
			System.out.println(s.substring(0,s.length()/2));
			return r.equals(s.substring(0,s.length()/2));
		}
	}

}
