
public class permu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="90";
		permutation(s);

	}

	private static void permutation(String s) {
		// TODO Auto-generated method stub
		 permutation("",s);
		
	}

	private static void permutation(String prefix, String s) {
		// TODO Auto-generated method stub
		//return null;
		if(s.length()==0)
			{System.out.println(prefix);}
		else{
			
			for(int i=0;i<s.length();i++)
			{
				permutation(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1));
			}
		}	
		
	}

}
