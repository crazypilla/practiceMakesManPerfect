import java.util.HashSet;

public class ctcioneone {
	public static void main(String[] args)
	{
		String str="a  ";
		System.out.println(isUnique(str));
		
	}

	private static boolean isUnique(String str) {
		// TODO Auto-generated method stub
		//return null;
		System.out.println(str+"yahoo");
		str=str.trim();
		System.out.println(str+"yahoo");
		if(str==null)
			return true;
		HashSet<Character> set=new HashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
		  if(!set.add(str.charAt(i)))
			  return false;
		  
		}
		return true;
	}

}
