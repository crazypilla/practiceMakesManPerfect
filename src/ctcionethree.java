import java.util.HashSet;

public class ctcionethree {
	public static void main(String[] args)
	{
		String str1="abcdefff";
		String str2="abcdeffc";
		System.out.println(isPermutation(str1,str2));
		
		
	}

	private static boolean isPermutation(String str1, String str2) {
		// TODO Auto-generated method stub
		//return null;
		 if(str1.length()!=str2.length())
			  {return false;
			  }
		 
		if(str1==null&&str2==null)
		{
			return true;
		}
		HashSet<Character> set1=new HashSet<>();
		HashSet<Character> set2=new HashSet<>();
		for(int i=0;i<str1.length();i++)
		{
			set1.add(str1.charAt(i));
			//set2.add(str2.charAt(index))	
		}
		for(int j=0;j<str2.length();j++)
		{
			set2.add(str2.charAt(j));
			//set2.add(str2.charAt(index))	
		}
		if(set1.size()!=set2.size())
		{
			return false;
		}
		return set2.containsAll(set1);
		
	}

}
