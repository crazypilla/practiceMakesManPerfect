import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class cc21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> ll=new LinkedList<>();
		String str="FOLLOWUP";
		for(int i=0;i<str.length();i++)
		{
			ll.add(str.charAt(i));
			
		}
		System.out.println(removeDups(ll));
		
	}

	private static LinkedList<Character> removeDups(LinkedList<Character> ll) {
		// TODO Auto-generated method stub
		//return null;
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		if(ll==null)
			return ll;
		
		else{
			
			
			
			for(int i=0;i<ll.size();i++)
			{
				set.add(ll.get(i));
					
			}
		}
		return new LinkedList<Character>(set);
		
		
		
	}

}
