import java.util.Arrays;

public class ctci12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcdefg";
		String str2="bcdeafg";
		System.out.println(arePermu(str1,str2));
	
		

	}

	private static boolean arePermu(String str1, String str2) {
		// TODO Auto-generated method stub
		//return null;
		if(str1.length()!=str2.length())
			  return false;
		char[] strchar1=str1.toCharArray();
		char[] strchar2=str2.toCharArray();
		Arrays.sort(strchar1);
		Arrays.sort(strchar2);
		for(int i=0;i<strchar1.length;i++)
		{
			if(strchar1[i]!=strchar2[i])
			{
				return false;
			}
		}
		return true;
	}

}
