import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class mapPractice {
	
	public static void main(String[] args)
	{
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Janu", 23);
		map.put("Kittu", 25);
		map.put("Anu", 15);
		map.put("Aharu",29);
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("*****************");
		//sort by name
		TreeMap<String,Integer> tmap=new TreeMap<>(map);
		ArrayList<Map.Entry<String,Integer>> list=new ArrayList<>();
		
		for(Map.Entry<String,Integer> entry1:tmap.entrySet())
		{   list.add(entry1);
			System.out.println(entry1.getKey()+" "+entry1.getValue());
		}
		System.out.println("***sort by value***");
		
		Collections.sort(list,new Comparator <Map.Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue()-o2.getValue();
			}
			
		});
		
		
		/*for(Map.Entry<String,Integer> e: list){
			//System.out.println("***");
			System.out.println(e.getKey()+" "+e.getValue());
			
		}*/
		TreeMap<String,Integer> map2=new TreeMap<>();
		for(Map.Entry<String,Integer> e: list){
			//System.out.println("***");
			map2.put(e.getKey(), e.getValue());
			
		}
		
		for(Map.Entry<String,Integer> e: map2.entrySet()){
			//System.out.println("***");
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
		
		
	}

}
