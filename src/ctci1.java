import java.util.HashSet;

public class ctci1 {
	public static void main(String[] args)
	{
		
		String str="abc";
		System.out.println(isUnique(str));
		System.out.println(isUniqueNoDs(str));
		
		
	}

	private static char[] isUniqueNoDs(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean isUnique(String str) {
		// TODO Auto-generated method stub
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(set.contains(str.charAt(i)))
			{
				return false;
			}
			else{
				set.add(str.charAt(i));
			}
			//return true;
		}
		return true;
	}

}
