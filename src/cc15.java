import java.util.ArrayList;
import java.util.Collections;

public class cc15 {
public static void main(String[] args)
{
	
String str1="pale";
String str2="ple";
System.out.println(oneEdit(str1,str2));


}

private static boolean oneEdit(String str1, String str2) {
	// TODO Auto-generated method stub
	//return null;
	if(str1.length()==str2.length())
		return oneReplace(str1,str2);
	if(Math.abs(str1.length()-str2.length())==1)
		return oneInsertRemove(str1,str2);
	else
		return false;
}

private static boolean oneReplace(String str1, String str2) {
	// TODO Auto-generated method stub
	System.out.println("one replace");
	int n=str1.length();
	ArrayList<Character> al1=new ArrayList<>();
	ArrayList<Character> al2=new ArrayList<>();
	
	for(int i=0;i<n;i++)
	{
		al1.add(str1.charAt(i));
		al2.add(str2.charAt(i));
		
	}
	Collections.sort(al1);
	Collections.sort(al2);
	int diff=0;
	for(int i=0;i<n;i++)
	{
		if(al1.get(i)!=al2.get(i))
			diff++;
	}
	if(diff==1)
		return true;
	return false;
}

private static boolean oneInsertRemove(String str1, String str2) {
	// TODO Auto-generated method stub
	//System.out.println("one insert replace");
	String s1,s2;
	if(str1.length()>str2.length())
	{
		 s1=str1;
	     s2=str2;
	}
	else{
		 s1=str2;
		 s2=str1;
	}
	ArrayList<Character> al1=new ArrayList<>();
	ArrayList<Character> al2=new ArrayList<>();
	for(int i=0;i<s1.length()-1;i++)
		{al1.add(s1.charAt(i));
	     al2.add(s2.charAt(i));
		}
	al1.add(s1.charAt(s1.length()-1));
	Collections.sort(al1);
	Collections.sort(al2);
	//System.out.println(al1);
	//System.out.println(al2);
	
   return al1.containsAll(al2);
}
}
