
public class ctcionetwo {
	public static void main(String[] args)
	{
		String toberev="abcdefg ";
		System.out.println(reverse(toberev));
		
	}

	private static String reverse(String toberev) {
		// TODO Auto-generated method stub
		//return null;
		String str=toberev.trim();
		//return new StringBuilder(str).reverse().toString();
	   char[] tobe=str.toCharArray();
		
		//System.out.println(tobe.toString());
		int i=0;
		int j=str.length()-1;
		while(i<j&&i<toberev.length()/2)
		{
			char temp=tobe[i];
			tobe[i]=tobe[j];
			tobe[j]=temp;
			i++;
			j--;
		}
		StringBuilder sb=new StringBuilder();
		for(int l=0;l<str.length();l++)
		{ 
			sb.append(tobe[l]);
		}
		return sb.toString();
	}

}
