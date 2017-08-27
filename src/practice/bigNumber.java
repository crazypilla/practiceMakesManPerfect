package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class bigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={54, 546, 548, 60};
		ArrayList<Integer> list=new ArrayList<Integer>();
		//list.addAll(arr);
		for(int x:arr)
		{
			list.add(x);
		}
		Collections.sort(list,new  Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				
                 String x=Integer.toString(o1);
                 String y=Integer.toString(o2);
                 return (y+x).compareTo(x+y);
			}
			
		});
		StringBuilder sb=new StringBuilder();
		
		for(int x:list)
		{
		  sb.append(x);	
		}
    System.out.println(sb.toString());
	}

}
