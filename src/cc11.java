import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class cc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="klfdf";
 // System.out.println(isUnique(str));
  System.out.println(longMethod(str));
	}

	private static boolean longMethod(String str) {
		// TODO Auto-generated method stub
		//return null;
		
		char[] charArr=str.toCharArray();
		Arrays.sort(charArr);
		char prev=charArr[0];
		for(int i=1;i<charArr.length;i++)
		{
			if(charArr[i]==prev)
				return false;
			prev=charArr[i];
		}
		return true;
	}

	private static boolean isUnique(String str) {
		// TODO Auto-generated method stub
		//return null;
		
		if(str==null)
			return true;
	//	boolean isUnique;
		
			
			HashSet<Character> set=new HashSet<>();
			
			for(int i=0;i<str.length();i++)
			{
				if(!set.add(str.charAt(i)))
					return false;
			}
			
			return true;
		
	}

}
