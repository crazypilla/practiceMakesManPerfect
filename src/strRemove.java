import java.util.HashSet;

public class strRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="eleaphant";
		String str2="ant";
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<str2.length();i++)
		{ set.add(str2.charAt(i));
			
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str1.length();i++)
		{
			if(!set.contains(str1.charAt(i)))
			{
				sb.append(str1.charAt(i));
			}
		}
		System.out.println(sb.toString());

	}

}
