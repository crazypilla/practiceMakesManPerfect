import java.util.ArrayList;

public class permsPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String str="abc";
	 System.out.println(printPerms(str));;

	}

	private static ArrayList<String> printPerms(String str) {
		// TODO Auto-generated method stub
		ArrayList<String> result=new ArrayList<>();
		if(str==null)
			return result;
		return permsUtil("",str,result);	
	}

	private static ArrayList<String> permsUtil(String prefix, String str, ArrayList<String> result) {
		// TODO Auto-generated method stub
		//return null;
		int length=str.length();
		
		if(str.length()==0)
		{
			result.add(prefix);
		}
		else{
		for(int i=0;i<length;i++)
		{
			permsUtil(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1),result);
		}
		}
		return result;
	}

}
