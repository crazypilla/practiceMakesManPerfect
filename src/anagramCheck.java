import java.util.ArrayList;
import java.util.Collections;

public class anagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1="AABBC";
     String str2="CBBAA";
     System.out.println(anacheck(str1,str2));
     
	}

	private static boolean anacheck(String str1, String str2) {
		// TODO Auto-generated method stub
		//return null;
		//System.out.println(str1.toLowerCase());
		if(str1.length()!=str2.length())
			return false;
		StringBuilder sb=new StringBuilder(str1.toLowerCase());
		
		if(str2.toLowerCase().equals(sb.reverse().toString()))
			return false;
		else{
			ArrayList<Character> al1=new ArrayList<>();
			ArrayList<Character> al2=new ArrayList<>();
			str1.toLowerCase();
			str2.toLowerCase();
			for(int i=0;i<str1.length();i++)
			{
				al1.add(str1.charAt(i));
				al2.add(str2.charAt(i));
			}
			Collections.sort(al1);
			Collections.sort(al2);
			if(al1.equals(al2))
				return true;
			else
				return false;
		}
	}

}
