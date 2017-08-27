package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> map=new TreeMap<>();
		map.put("harsh",93);
		map.put("karthik", 99);
		map.put("laika", 87);
		for(Map.Entry<String,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
