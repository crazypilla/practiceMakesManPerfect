import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
 
public class treemap {
 
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 10);
		map.put("b", 30);
		map.put("c", 50);
		map.put("d", 40);
		map.put("e", 20);
		HashMap<String,Integer> sorted=sortByValue(map);
		for (Map.Entry entry : sorted.entrySet()) {
		    System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
	}

	private static HashMap<String, Integer> sortByValue(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		List<Map.Entry<String,Integer>> list=new ArrayList<>();
		list.addAll(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
		
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue()-o2.getValue();}
			});
		LinkedHashMap<String,Integer> finalMap=new LinkedHashMap<>();
		for(int i=0;i<list.size();i++)
		
		{  Map.Entry<String,Integer> entry=list.get(i);
			finalMap.put(entry.getKey(),entry.getValue());
			}
		return finalMap;
	}
	}
 
