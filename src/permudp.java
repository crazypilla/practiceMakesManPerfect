import java.util.ArrayList;

public class permudp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc";
		ArrayList<String> res=new ArrayList<>();
		getPermu("",str,str.length(),res);
		System.out.println(res);

	}

	private static void getPermu(String prefix, String str, int n, ArrayList<String> res) {
		// TODO Auto-generated method stub
		if(prefix.length()==n)
		{
			System.out.println(prefix);
			res.add(prefix);
		}
		for(int i=0;i<str.length();i++)
		{  
			   getPermu(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1),n,res);
		}
		
	}

}
