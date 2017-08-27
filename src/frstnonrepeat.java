import java.util.HashSet;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class frstnonrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abzddab";
		HashSet<Character> set=new HashSet<>();
		HashSet<Character> repeatSet=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(!set.add(str.charAt(i)))
				{repeatSet.add(str.charAt(i));
				  //System.out.println(str.charAt(i));
				  //break;
				}
			
		}
		Iterator<Character> it=set.iterator();
		while(it.hasNext())
		{
		 char ele=(it.next());
		 if(repeatSet.contains(ele))
		 { System.out.println(ele);
			break;
		 }
		}
		

	}

}
