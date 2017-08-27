import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class secondrepeat {
	

	
public static void main(String[] args)
{
  String str="aaa bbb ccc aaa bbb aaa";
  String[] input=str.split(" ");
  HashMap<String,Integer> map=new HashMap<>();
  for(int i=0;i<input.length;i++)
  {
	  if(!map.containsKey(input[i]))
	  {
		  map.put(input[i],1);
	  }
	  else{
	    
		  int count=map.get(input[i]);
		  map.put(input[i],count+1);
	  }
  }
  //Comparator newComp=new valueComparator(map);
  //System.out.println(newComp.m);
  TreeMap<String,Integer> result=getSortedMap(map);
  TreeMap<String,Integer> keySorted=new TreeMap<String,Integer>(new Comparator<String>(){
	  public int compare(String s1,String s2)
	  {
		  return s2.compareTo(s1);
	  }
  });
 
  keySorted.putAll(map);
  
  /*ArrayList<Map.Entry<String,Integer>> list=new ArrayList<>();
  for(Map.Entry<String,Integer>entry:map.entrySet())
  {
	  System.out.println(entry.getKey()+"   "+entry.getValue());
	  list.add(entry);
  }
 
  
  Collections.sort(list,new Comparator<Map.Entry<String, Integer>>(){

	@Override
	public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
		// TODO Auto-generated method stub
		return e2.getValue()-e1.getValue();
	}
	  
  });
  System.out.println(list.get(1).getKey());
// HashMap<String,Integer> sortedMap=new HashMap<String,Integer>();
 */
  for(Map.Entry<String,Integer>entry:map.entrySet())
  {
	  System.out.println(entry.getKey()+"   "+entry.getValue());
	 // list.add(entry);
  }
  for(Map.Entry<String,Integer>entry:result.entrySet())
  {
	  System.out.println(entry.getKey()+"   "+entry.getValue());
	 // list.add(entry);
  }
  for(Map.Entry<String,Integer>entry:keySorted.entrySet())
  {
	  System.out.println(entry.getKey()+"   "+entry.getValue());
	 // list.add(entry);
  }
 
}

private static TreeMap<String, Integer> getSortedMap(HashMap<String, Integer> map) {
	// TODO Auto-generated method stub
	 TreeMap<String,Integer> sortMap=new TreeMap<String,Integer>(new valueComparator(map));
	  sortMap.putAll(map);
	  return sortMap;
}
}
