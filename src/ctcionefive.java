
public class ctcionefive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabcccccaaa";
		System.out.println(counter(str));
         
	}

	private static String counter(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		char frst=str.charAt(0);
		int cnt=1;
		for(int i=1;i<str.length();i++)
		{ char sec=str.charAt(i);
		  if(frst==sec)
		  {cnt++;
		  }
		  else{
			  sb.append(frst);
			  sb.append(cnt);
			  cnt=1;
			  frst=sec;
			  
		  }
		  if(i==str.length()-1)
		  {
			  sb.append(sec);
			  sb.append(cnt);
		  }
		}
		return sb.toString();
		
	}

}
