import java.util.ArrayList;
import java.util.Arrays;

public class cc12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String str2="cab";
		if(str.length()!=str2.length())
			System.out.println("no");
		else{
		char[] x=(str.toCharArray());
		Arrays.sort(x);
		char[] y=(str2.toCharArray());
		Arrays.sort(y);
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(x[i]!=y[i])
				{System.out.println("no");
				break;
				}
			cnt++;
		}
		if(cnt==str.length())
		   System.out.println("yes");
		}
		/*
		if(str.length()!=str2.length())
			{System.out.println("nope..not perms");
			//break;
			}
		else{		
		if(permutation(str).contains(str2))
			System.out.println("yes..perms");
		else
			System.out.println("nope..");
		}*/

	}

	private static ArrayList<String> permutation(String str) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		permutations("",str,al);
		return (al);
		
	}

	private static void permutations(String prefix,String str,ArrayList<String> al) {
		// TODO Auto-generated method stub
	int n=str.length();
	if(n==0)
		{//System.out.println(prefix);
		
		 al.add(prefix);
		}
	else{
		
		for(int i=0;i<str.length();i++)
		{
			permutations(prefix+str.charAt(i),str.substring(0, i)+str.substring(i+1),al);
		}
		
	}
		
	}

}
