import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class nonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="interview";
		LinkedHashMap<Character,Boolean> map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{  char c=s.charAt(i) ;
			if(!map.containsKey(c))
				{map.put(c,true);}
			else{ 
				boolean val=map.get(c);
				map.put(c,false);
				
			}
			
			
		}
		for(Map.Entry<Character,Boolean> entry:map.entrySet())
		{  //System.out.print(entry.getKey());
			if(entry.getValue()==true)
				{System.out.println(entry.getKey());
				  break;
				}
		}
		

	}

}
