import java.util.ArrayList;
import java.util.HashMap;

public class longestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<>();
		list.add("cat");
		list.add("banana");
		list.add("dog");
		list.add("nana");
		list.add("walk");
        list.add("walker");
        list.add("dogwalker");
        list.add("dogwalkcat");
        System.out.println(list);
        HashMap<String,Integer> map=new HashMap<>();
        String maxString=null;
        int maxLength=0;int count=0;
        for(int i=0;i<list.size();i++)
        {
        	String str=list.get(i);
        	for(int j=0;j<str.length();j++)
        	{   count=0;
        		String one=str.substring(0,j);
        		String two=str.substring(j);
        		//System.out.println(one+" "+two);
        		
        		if(!map.containsKey(one))
        		{
        			if(list.contains(one))
        			{
        				count++;
        				map.put(one, 1);
        			}
        		}
        		else{
        			count+=map.get(one);
        		}
        		if(!map.containsKey(two))
        		{
        			if(list.contains(two))
        			{
        				count++;
        				map.put(two, 1);
        			}
        		}
        		else{
        			count+=map.get(two);
        		}
        		if(count>maxLength)
        		{
        			maxLength=count;
        			 maxString=str;
        		}
        	}
        	
        		if(!map.containsKey(str))
        		{
        			map.put(str,count);
        		}
        		
        }
        System.out.println(maxString);
	}
    
}
