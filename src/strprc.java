import java.util.HashSet;

public class strprc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="#%*&>,...123..*&%^345";
		StringBuilder sb=new StringBuilder();
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
					{
				      if(set.add(str.charAt(i)))
				      {
				    	  sb.append(str.charAt(i));
				      }
					}
				
		}
		System.out.println(Integer.parseInt(sb.toString()));

	}

}
